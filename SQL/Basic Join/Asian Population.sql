--     Author: Rodney Shaghoulian
--     Github: github.com/rshaghoulian
-- HackerRank: hackerrank.com/rshaghoulian

SELECT SUM(CITY.POPULATION) 
FROM CITY, COUNTRY
WHERE CITY.COUNTRYCODE = COUNTRY.CODE AND COUNTRY.CONTINENT = 'Asia';
