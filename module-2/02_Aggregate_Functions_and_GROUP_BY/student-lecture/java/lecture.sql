--------------------------------------------------------------------------------------------------------
-- Ordering, Grouping Basic Functions Lecture Code
--------------------------------------------------------------------------------------------------------
--
-- ORDER BY -  Sequence of Rows in Result
--
--    ORDER BY          -- Ascending Sequence (low-high)
--    ORDER BY ASC      -- Ascending Sequence (low-high)
--    ORDER BY DESC     -- Descending Sequence (high-low)

-- Show Populations of all countries in acscending order
Select name, population
From country
order by population
;
-- Show Populations of all countries in descending order
Select name, population
From country
order by population desc
;
-- Show  the names of countries and continents in ascending order
Select name, continent
From country
Order by continent, country
;
--------------------------------------------------------------------------------------------------------
-- Limiting the number of rows in the result
--
-- LIMIT n   - Limit the number of rows in the result - always goes at the end of the SELECT
--
--
-- Show the name and average life expectancy of the countries with the 10 highest life expectancies.
Select name, lifeexpectancy 
From country
Where lifeexpectancy is not null
Order by lifeexpectancy desc
limit 10 
;
--------------------------------------------------------------------------------------------------------
-- Concatenating values 
--
-- the concat operator (||) may be used to concatenate character (string) values in a result
--

-- Show the name & state in the format: "city-name, state"
-- of all cities in California, Oregon, or Washington.
-- sorted by state then city
Select name || ', ' || district as city_name
From city
Where district in('California', 'Oregon','Washington')
order by district, name
;

--------------------------------------------------------------------------------------------------------
-- Aggregate functions - produce one row in result for each group specified
--
-- The group used by the aggregate functions is determined by the GROUP BY clause
-- if no GROUP BY clause is specified, the group is the set of rows in the result
--
--     AVG(column-expression)   - arithmentic average for group of non-NULL values in expression 
--     SUM(column-expression)   - arithmentic sum for group of a non-NULL values in expression 
--     MIN(column-expression)   - lowest value for group of non-NULL values in expression 
--     MAX(column-expression)   - highest value for group of non-NULL values in expression 
--     COUNT(*)                 - number of rows in the group
--     COUNT(column-expression) - number of rows for the group of non-NULL values in expression 
--
--
-- AVG(), SUM() may only bes used with numeric data types
-- MIN(), MAX() may be used with numeric, character, date, time datatypes
--
-- COUNT() is applied to rows (not columns)
--
--
-- Show average life expectancy in the world
select avg (lifeexpectancy)
, min (lifeexpectancy)
, max (lifeexpectancy)
from country
;
-- Show the total population in Ohio
Select sum (population)
From city
Where district = 'Ohio'
;
-- Show the surface area of the smallest country in the world
Select name, min(surfacearea)
From country
group by name
order by 2
limit 1
;

-- Show The 10 largest countries (by surface area) in the world
Select name, surfacearea
From country
order by surfacearea desc
limit 10
;

-- Show the number of countries who declared independence in 1991
Select count (*)
from country
Where indepyear = 1991
;
--------------------------------------------------------------------------------------------------------
-- GROUP BY  - Specify the group to which the aggregate functions apply
--
--      GROUP BY column-expression
--
-- When using a GROUP BY the SELECT is limited ot aggreggate functions or columns in the GROUP BY
--
--

-- Show the number of countries where each language is spoken, order show them from most countries to least
Select language, count (*)
From countrylanguage
group by language
order by 2 desc
;

-- Show the average life expectancy of each continent ordered from highest to lowest
Select continent, avg(lifeexpectancy)
From country
Where lifeexpectancy is not null
group by continent
;


-- Exclude Antarctica from consideration for average life expectancy



-- What is the sum of the population of cities in each state in the USA ordered by state name

Select district, sum(population)
From city
Where countrycode = 'USA'
group by district
order by 2
;
-- What is the average population of cities in each state in the USA ordered by state name

--------------------------------------------------------------------------------------------------------
-- SUBQUERIES - Using the result from one query (inner query) in another query (outer query)
--
-- Frequently used in a WHERE clause with an IN predicate:
--
--       WHERE column-name IN (SELECT column-name FROM some-table WHERE some-predicate)
--
-- Any WHERE predicate may be used to connect the subquery in a WHERE clause, but you must
-- be sure a single value is returned from the subquery. 
--
-- Subqueries may also be used in a SELECT as a column-specification or a FROM as a table
-- (These are advanced concepts we will discuss later, if there is time)
--
-- Show the cities under the same given government leader
Select name
From city
Where countrycode in(Select code
                     from country
                     Where headofstate = 'Jacques Chirac')
;

-- Show countries with the same independece year


-- Show the cities whose country has not yet declared independence yet

Select name
From city
Where countrycode in (
Select code
From country 
Where indepyear is null)
;

--------------------------------------------------------------------------------------------------------
--
-- Additional samples
--
-- You may alias column and table names to provide more descriptive names
--
SELECT name AS CityName 
  FROM city AS cities

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)
SELECT name
     , population 
  FROM city 
 WHERE countryCode='USA' 
 ORDER BY name ASC, population DESC
;
-- Limiting results allows rows to be returned in 'limited' clusters where LIMIT says how many, 
-- and an optional OFFSET specifies number of rows to skip
SELECT name
     , population 
  FROM city 
  LIMIT 10 OFFSET 10
;