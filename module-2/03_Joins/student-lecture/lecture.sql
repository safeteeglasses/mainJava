-- Keys, Joins and Unions
--
-- Primary Key - a column or set of columns that uniquely identify a row in a table (Parent table)
-- Foreigh Key - a column or set of columns that match the primary key of another table (Dependent table)
--
-- Natural Key - Value(s) that exist for a table that can be used as primary keys
-- Surrogate Key - Artificially generated keys to use as a primary key
--
--  Joins are used when columns from multiple tables are required in a query
--
-- INNER JOIN - Matching rows between tables 
-- 
-- OUTER JOIN - All rows from both tables - the full set      
------------------------------------------------------------------------------------------------
-- Inner Join syntax - 2 forms
-- 
--  SELECT columns
--    FROM table1, table2  
--  WHERE table1.column = table2.column  
--
--
--  SELECT columns
--    FROM table1
--         INNER JOIN
--         table2
--      on table1.column = table2.column
--
-- Additional WHERE predicates may be added to either syntax to filter rows
------------------------------------------------------------------------------------------------
-- -- OUTER JOIN syntax 
--
--  SELECT columns
--    FROM table1
--         FULL OUTER JOIN
--         table2
--      on table1.column = table2.column
--
-- Additional WHERE predicates may be added to either syntax to filter rows
------------------------------------------------------------------------------------------------
-- UNION - Merging rows between two tables
--
-- Each SELECT must have the same number of columns in the same order and be compatible datatypes 
--      use literals if necessary to make the UNION work
--
-- SELECT columns
--   FROM table1
-- WHERE predicate
--
-- UNION
--
-- SELECT columns
--   FROM table2
-- WHERE predicate
------------------------------------------------------------------------------------------------
--
-- UNION All - Concatenating rows between two tables
--
-- Each SELECT must have the same number of columns in the same order and be compatible datatypes 
--      use literals if necessary to make the UNION work
--
-- SELECT columns
--   FROM table1
-- WHERE predicate
--
-- UNION ALL
--
-- SELECT columns
--   FROM table2
-- WHERE predicate
------------------------------------------------------------------------------------------------
-- Show the last_name of all the actors in the movie FINDING ANACONDA

Select last_name
From actor, film_actor, film
Where actor.actor_id = film_actor.actor_id -- join condition
    and film.film_id = film_actor.film_id  -- join condition
    and title = 'FINDING ANACONDA'         -- filter condition
;
--
Select last_name
From actor
        inner join
     film_actor
        on
        actor.actor_id = film_actor.actor_id
        inner join
     film
        on film.film_id = film_actor.film_id
        and title = 'FINDING ANACONDA' 
        ;
-- 
--

--
-- ********* INNER JOIN ***********

-- Let's find out who made payment 16666:
Select customer_id
From payment
where payment_id = 16666
;
-- Ok, that gives us a customer_id, but not the name. We can use the customer_id to get the name FROM the customer table
Select  customer.customer_id, first_name || ' ' || last_name as first_name_last_name
From payment
        inner join
         customer
         on payment.customer_id = customer.customer_id
where payment_id = 16666
;
-- We can see that the * pulls back everything from both tables. We just want everything from payment and then the first and last name of the customer:
Select  p.*,c.customer_id, c.first_name || ' ' || c.last_name as first_name_last_name
From payment p     --assigned correlation name p to the payment table
        inner join
         customer c  --assigned correlation name c to the customer table
         on p.customer_id = c.customer_id
where p.payment_id = 16666
;
--A correlation name can be assigned to a table to make coding easier
--(nickname)
--
Select  c.customer_id, c.first_name || ' ' || c.last_name as first_name_last_name
From payment p     --assigned correlation name p to the payment table
        inner join
         customer c  --assigned correlation name c to the customer table
         on p.customer_id = c.customer_id
where p.payment_id = 16666
;



-- But when did they return the rental? Where would that data come from? From the rental table, so let’s join that.

-- What did they rent? Film id can be gotten through inventory.

-- What if we wanted to know who acted in that film?    

-- What if we wanted a list of all the films and their categories ordered by film title

-- Show all the 'Comedy' films ordered by film title

-- Finally, let's count the number of films under each category






-- *********** UNION *************

-- Back to the "dvdstore" database...

-- Gathers a list of all first names used by actors and customers
-- By default removes duplicates
Select first_name, 'is an actor'
from actor
union
Select first_name, 'is a customer'
from customer
order by first_name
;

-- Gather the list, but this time note the source table with 'A' for actor and 'C' for customer
Select first_name, 'is an actor'
from actor
union all
Select first_name, 'is a customer'
from customer
order by first_name
;