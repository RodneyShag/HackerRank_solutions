-- Author: Rodney Shaghoulian
-- Github: github.com/RodneyShag

SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP '^[^aeiou]|[^aeiou]$';
