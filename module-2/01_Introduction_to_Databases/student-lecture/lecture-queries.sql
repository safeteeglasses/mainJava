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
--      ORDER BY - sequence of rows in teh result
--
-- WHERE predicates:
--
--        =  <>  !=  >  >=  <  <= 
--        IN(list-of-values)
--        NOT IN(list-of-values)
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


-- Show the names for all countries


-- Show the name and population of all countries


-- Show all columns from the city table


-- Show the cities in Ohio
 

-- Show countries that gained independence in the year 1776


-- Show countries not in Asia


-- Show countries that do not have an independence year


-- Show countries that do have an indepenShowr


-- Show countries that have a population greater than 5 million


-- Show cities in Ohio and Population greater than 400,000


-- Show country names on the continent North America or South America


-- Show the population, life expectancy, and population per area (population / surfacearea)





