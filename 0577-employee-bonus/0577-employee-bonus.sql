# Write your MySQL query statement below
SELECT Employee.name,Bonus.bonus from Employee 
Left Join Bonus ON Employee.empId=Bonus.empId
where Bonus.bonus<1000 OR Bonus.bonus is null;