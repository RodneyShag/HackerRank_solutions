--     Author: Rodney Shaghoulian
--     Github: github.com/rshaghoulian
-- HackerRank: hackerrank.com/rshaghoulian

SELECT CITY, LENGTH(CITY) FROM STATION
ORDER BY LENGTH(CITY), CITY
LIMIT 1;

SELECT CITY, LENGTH(CITY) FROM STATION
ORDER BY LENGTH(CITY) DESC, CITY
LIMIT 1;
