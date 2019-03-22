-- Author: Rodney Shaghoulian
-- Github: github.com/RodneyShag

SELECT
    TRUNCATE(MAX(LAT_N), 4)
FROM
    STATION
WHERE
    LAT_N < 137.2345;
