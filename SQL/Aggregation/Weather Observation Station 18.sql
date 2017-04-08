--     Author: Rodney Shaghoulian
--     Github: github.com/rshaghoulian
-- HackerRank: hackerrank.com/rshaghoulian

SELECT
    ROUND(ABS(MAX(LAT_N)  - MIN(LAT_N))
        + ABS(MAX(LONG_W) - MIN(LONG_W)), 4)
FROM 
    STATION;
