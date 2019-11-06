-- Github: github.com/RodneyShag

SELECT Name FROM STUDENTS
WHERE Marks > 75
ORDER BY SUBSTR(Name, -3), ID;
