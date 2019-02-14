-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
Select title
From actor a
        join
     film_actor fa
        on a.actor_id = fa.actor_id
        join
     film f
        on
        f.film_id = fa.film_id
        and last_name = 'STALLONE'
;
-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
Select title
From actor a
        join
     film_actor fa
        on a.actor_id = fa.actor_id
        join
     film f
        on
        f.film_id = fa.film_id
    Where last_name = 'REYNOLDS' and first_name = 'RITA'
;
-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
Select title
from actor a 
        join
     film_actor fa
        on a.actor_id = fa.actor_id
        join
     film f
        on
        f.film_id = fa.film_id
    where last_name = 'DEAN' and (first_name = 'JUDY' OR first_name = 'RIVER')
    ;
-- 4. All of the the ‘Documentary’ films
-- (68 rows)
Select title
From category c
        join
     film_category fc
        on c.category_id = fc.category_id
        join
     film f
        on
        fc.film_id = f.film_id
        where name = 'Documentary'
;
-- 5. All of the ‘Comedy’ films
-- (58 rows)
Select title
From category c
        join
     film_category fc
        on c.category_id = fc.category_id
        join
     film f
        on
        fc.film_id = f.film_id
        where name = 'Comedy'
;
-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
Select title
From category c
        join
     film_category fc
        on c.category_id = fc.category_id
        join
     film f
        on
        fc.film_id = f.film_id
        where name = 'Children' and rating = 'G'
;
-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
Select title
From category c
        join
     film_category fc
        on c.category_id = fc.category_id
        join
     film f
        on
        fc.film_id = f.film_id
        where name = 'Family' and length < 120 and rating = 'G'
;        
-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
Select title
From actor a 
        join
     film_actor fa
        on a.actor_id = fa.actor_id
        join
     film f
        on fa.film_id = f.film_id
        join
     film_category fc
        on f.film_id = fc.film_id
        join
     category c
        on fc.category_id = c.category_id
        where rating = 'G' and first_name = 'MATTHEW' and last_name = 'LEIGH'
; 
        
        
-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
Select title
From category c
        join
     film_category fc
        on c.category_id = fc.category_id
        join
     film f
        on
        fc.film_id = f.film_id
        Where name = 'Sci-Fi' and release_year = 2006
;
-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
Select title
From actor a 
        join
     film_actor fa
        on a.actor_id = fa.actor_id
        join
     film f
        on fa.film_id = f.film_id
        join
     film_category fc
        on f.film_id = fc.film_id
        join
     category c
        on fc.category_id = c.category_id
        where first_name = 'NICK' and last_name = 'STALLONE' and name = 'Action'
;
-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
Select address, city, district, country
From country co
         join
     city ci
         on co.country_id = ci.country_id
         join
     address a
         on ci.city_id = a.city_id
         join
     store s
         on a.address_id = s.address_id
 ;        
-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
Select s.store_id, address, first_name || ', ' || last_name as first_name_last_name
From store s
        join 
     address a
        on s.address_id = a.address_id
        join
     staff st
        on st.staff_id = s.manager_staff_id
        
;
-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)
Select count(r.customer_id), c.first_name || ' ' || c.last_name as customer
From customer c
        join
     rental r
        on c.customer_id = r.customer_id
        group by customer, r.customer_id
        order by 1 desc
        limit 10
        ;
-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)
Select sum(payment.amount) as total_sales_amount, sum(payment.amount) as avg_payment, count(rental)
-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
