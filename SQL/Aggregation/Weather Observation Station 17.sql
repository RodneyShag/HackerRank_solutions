-- Author: Rodney Shaghoulian
-- Github: github.com/RodneyShag

SELECT ROUND(LONG_W, 4)
FROM STATION
WHERE LAT_N > 38.7780
ORDER BY LAT_N
LIMIT 1;
