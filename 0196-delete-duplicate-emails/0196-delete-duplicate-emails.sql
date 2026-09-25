# Write your MySQL query statement below
DELETE p2 FROM Person p2
INNER JOIN Person p1
WHERE p1.Email = p2.Email AND p1.Id < p2.Id;   