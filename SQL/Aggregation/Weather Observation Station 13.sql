-- Author: Rodney Shaghoulian
-- Github: github.com/RodneyShag

SELECT 
    TRUNCATE(SUM(LAT_N), 4)
FROM
    STATION
WHERE
    LAT_N BETWEEN 38.7880 AND 137.2345;
