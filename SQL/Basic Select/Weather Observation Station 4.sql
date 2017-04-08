--     Author: Rodney Shaghoulian
--     Github: github.com/rshaghoulian
-- HackerRank: hackerrank.com/rshaghoulian

SELECT 
    COUNT(CITY) - COUNT(DISTINCT CITY)
FROM
    STATION;
