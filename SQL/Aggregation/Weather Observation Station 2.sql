--     Author: Rodney Shaghoulian
--     Github: github.com/RodneyShag
-- HackerRank: hackerrank.com/RodneyShag

SELECT 
    ROUND(SUM(LAT_N), 2),
    ROUND(SUM(LONG_W), 2)
FROM
    STATION;
