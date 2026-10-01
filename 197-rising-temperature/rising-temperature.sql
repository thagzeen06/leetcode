# Write your MySQL query statement below
select w.id as id from Weather w join 
Weather b on datediff(w.recordDate,b.recordDate)=1
where w.temperature>b.temperature