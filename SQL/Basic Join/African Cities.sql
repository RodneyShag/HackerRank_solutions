--     Author: Rodney Shaghoulian
--     Github: github.com/rshaghoulian
-- HackerRank: hackerrank.com/rshaghoulian

SELECT CITY.NAME 
FROM CITY, COUNTRY
WHERE CITY.COUNTRYCODE = COUNTRY.CODE AND COUNTRY.CONTINENT = 'Africa';
