-- github.com/RodneyShag

SELECT
    CEIL(AVG(Salary) - AVG(REPLACE(SALARY, '0', '')))
FROM EMPLOYEES;
