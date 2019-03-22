-- Author: Rodney Shaghoulian
-- Github: github.com/RodneyShag

SELECT 
    ROUND(MIN(LAT_N), 4)
FROM
    STATION
WHERE
    LAT_N > 38.7780;
