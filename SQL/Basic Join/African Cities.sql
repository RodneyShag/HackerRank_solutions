--     Author: Rodney Shaghoulian
--     Github: github.com/RodneyShag
-- HackerRank: hackerrank.com/RodneyShag

SELECT CITY.NAME 
FROM CITY, COUNTRY
WHERE CITY.COUNTRYCODE = COUNTRY.CODE AND COUNTRY.CONTINENT = 'Africa';