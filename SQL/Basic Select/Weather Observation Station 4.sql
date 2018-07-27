--     Author: Rodney Shaghoulian
--     Github: github.com/RodneyShag
-- HackerRank: hackerrank.com/RodneyShag

SELECT 
    COUNT(CITY) - COUNT(DISTINCT CITY)
FROM
    STATION;
