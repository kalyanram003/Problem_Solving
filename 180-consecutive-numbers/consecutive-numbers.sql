# Write your MySQL query statement below
select distinct num as ConsecutiveNums 
from (
    select num,
        LAG(num,1) OVER(order by id) as num1,
        LAG(num,2) OVER(order by id) as num2
        from Logs
)t 
where t.num1=num and t.num2=num;