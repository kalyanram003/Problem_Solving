# Write your MySQL query statement below
select round(count(distinct a.player_id)/count(distinct b.player_id),2)
as fraction 
from(
    select player_id,min(event_date) as first_login 
    from Activity 
    group by player_id
) b
left join Activity a
on a.player_id=b.player_id
and a.event_date=b.first_login + INTERVAL 1 DAY;