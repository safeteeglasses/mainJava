--------------------------------------------------------------------------------------------------------
-- Basic SELECT Lecture Code
--------------------------------------------------------------------------------------------------------
-- -- indicates a comment - anything following on the line is ignored
--
-- SQL SELECT statement - retrieve values form the database (Read)
--
-- A SELECT statement is often referred to as a query
--
-- Basic syntax:
--
--      SELECT   - columns to include in the result (seperate mutiple column reqeusts with commas)
--      FROM     - table containing rows used in the query 
--      WHERE    - rows to include in the result
--      ORDER BY - sequence of rows in the result
--                 without an ORDER BY the sequence of the rows in the result is not predictable
--                 if the sequence of teh rows in teh result matter - code an ORDER BY
--
-- WHERE predicates:
--
--        =  <>  !=  >  >=  <  <= 
--        IN(list-of-values)      -- alterative to a series of = OR
--        NOT IN(list-of-values)  -- alterative to a series of != AND
--        BETWEEN value AND value
--        IS NULL
--        IS NOT NULL
--        LIKE    (use wildcards: % means 0 to any number of any characters
--                                _ means exactly any one character
--        ILIKE   (case insensivtive LIKE - Postgres extension)
--
-- predicates may be combined using AND and OR
--
-- use parentheses to make your multi-predicate condition clear

-- The DISTINCT clause on a SELECT removes duplicate values from the result
-- based on the all columns that follow
--
-- The DISTINCT ON(columns/expression) clause on a SELECT removes duplicate values from the result
-- based on the all columns/expression inside the parentheses that follow (Postgres extension)
------------------------------------------------------------------------------------------------------
--
-- Show all the rows and all the columns for all countries
SELECT *           -- all the coiumns
 FROM  country     -- from this tables
;
-- Show the names for all countries
SELECT name
  FROM country
;
-- Show the name and population of all countries
SELECT name, population   -- multiple columns are separated by commas
  FROM country
;

-- Show all columns from the city table
SELECT *
  FROM city
;
-- Show the cities in Ohio
SELECT name
  FROM city
 WHERE district = 'Ohio'   -- an SQL string litreal is enclosed in apostrophes (NOT double qoutes)
 ;
-- Show countries that gained independence in the year 1776
SELECT name
  FROM country
 where indepyear = 1776  -- numeric values are not out in aposts
 ;
-- Show countries not in Asia
SELECT name, continent
  FROM Country
 where continent <> 'Asia'   -- literals are acse sensitive
 ;

-- Show countries that do not have an independence year
Select name, indepyear
 from country
 where indepyear is null   -- only IS NULL or IS NOT NULL can be used to check for null values
 ;

-- Show countries that do have an independence year
Select name, indepyear
 from country
 where indepyear is not null   -- only IS NULL or IS NOT NULL can be used to check for null values
 ;

-- Show countries that have a population greater than 5 million
select name, population
from country
where population > 5000000
;
-- Show cities in Ohio and Population greater than 400,000
select name, population 
  from city
 where population > 400000
   and district = 'Ohio'
 order by population
;
-- Show country names on the continent North America or South America
select name, continent
from country
where continent = 'North America'
   or continent = 'South America'
;

select name, continent
from country
where continent IN ('North America', 'South America')
;

-- Show country names NOT on the continent North America or South America
select name, continent
from country
 where continent != 'North America'
   and continent != 'South America'
;

select name, continent
from country
where continent NOT IN ('North America', 'South America')
;


-- Show the population, life expectancy, and population per area (population / surfacearea)

select population
     , lifeexpectancy
     , population / surfacearea   -- calculated/derived column result on the select
                                  -- derived columns do not have column names
  from country
;

select population
     , lifeexpectancy
     , population / surfacearea AS Pop_per_area -- calculated/derived column result on the select
                                                -- AS provides a new name for a column ir derived column
  from country
;

-- The AS phrase may be used to assign new names to columns or provide names for derived columns
select name, population as how_Many_live_there
     , lifeexpectancy   as number_of_birthdays
     , population / surfacearea AS Pop_per_area -- calculated/derived column result on the select
                                                -- AS provides a new name for a column ir derived column
  from country
;

-- show the countries whose population is between 1,000,000 and 2,000,000
select name, population
  from country
 where population between 1000000 and 2000000  -- between can do a range check (inclusive)
 ;

-- show the states whose names are between 'Ohio' and 'Utah' in the USA
select name, district
 from city
 where district between 'Ohio' and 'Utah'
   and countrycode = 'USA'
 ;
-- list the countries that start with 'United'
Select name
  from country
  where name like 'United%'
  ;

-- list the countries that contain the word 'New'
Select name
  from country
  where name like '%New%'
  ;

-- list the countries that contain the word 'New'
Select name
  from country
  where name ilike '%NEW%'
  ;
  
  -- list the countries that end with 'Arabia'
Select name
  from country
  where name like '%stan'
  ;
  
  -- Show country names on the continent North America or South America if population is > 5000000
select name, continent, population
from country
where (continent = 'North America'
   or  continent = 'South America')
  and population > 5000000
  order by continent          -- if order omitted - ASC is assumed
         , population DESC
;