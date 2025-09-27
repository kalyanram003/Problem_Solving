# Write your MySQL query statement below
select score,
    DENSE_RANK() OVER(order by score DESC) as "rank"
from Scores
order by score DESC;