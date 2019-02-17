-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**
--INSERT INTO table-name 
--            (column-list)           -- must contain all non-null columns
--            VALUES(value-list)      -- order of values must match order of columns specified
-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
Begin Transaction;

insert into actor
(actor_id, first_name, last_name)
values(201, 'HAMPTON', 'AVENUE'),(202, 'LISA', 'BYWAY')
;
Select first_name
from actor
Where actor_id = 201
;
commit
;
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
Begin Transaction;

insert into film
      (film_id, title,       description,                                                        release_year, language_id, original_language_id, rental_duration, rental_rate, length, replacement_cost, rating)
values(1001, 'EUCLIDEAN PI', 'The Epic Story of Euclid as a Pizza Delivery Boy In Ancient Greece', 2008,            1,                 DEFAULT,            DEFAULT,       DEFAULT,    198,      DEFAULT,    DEFAULT)
;
Select title
From film
Where film_id = 1001
;
commit
;
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
Begin Transaction;

insert into film_actor
(actor_id, film_id)
values (201, 1001)
; 
insert into film_actor
(actor_id, film_id)
values (202, 1001)
;
Select actor_id, film_id
From film_actor
; 
Commit
;
-- 4. Add Mathmagical to the category table.
Begin Transaction;

insert into category
(category_id, name)
values (17, 'Mathmagical')
;
Select name
From category
where category_id = 17
;
Commit
;
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

--UPDATE - change data in a table
--
--  UPDATE table-name
--  SET column = new-value
--  WHERE condition    

Begin Transaction;

Insert into film_category
values (1001, 17)
;
commit
;

Update film_category
set category_id = (Select category_id from category where name = 'Mathmagical')
Where film_id in (select film_id 
                  from film 
                  where title 
                  in ('EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE'))
;
Select film_id, category_id
From film_category
;
Commit
;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
Begin Transaction;

update film
set rating = 'G'
Where film_id in (select film_id from film_category where category_id = 17)
; 
Select title, rating, film_id
from film 
Where rating = 'G' 

;
commit
;
-- 7. Add a copy of "Euclidean PI" to all the stores.
Begin Transaction;
insert into inventory (store_id, film_id)
Select store_id, (Select film_id From film Where title = 'EUCLIDEAN PI')
From store
;
Select inventory_id
From inventory i 
join film f
on f.film_id = i.film_id
where f.title = 'EUCLIDEAN PI'
;
Commit
;
-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.
