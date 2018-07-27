--     Author: Rodney Shaghoulian
--     Github: github.com/RodneyShag
-- HackerRank: hackerrank.com/RodneyShag

SELECT Name FROM STUDENTS
WHERE Marks > 75
ORDER BY RIGHT(Name, 3), ID;
