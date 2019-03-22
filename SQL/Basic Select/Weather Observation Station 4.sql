-- Author: Rodney Shaghoulian
-- Github: github.com/RodneyShag

SELECT 
    COUNT(CITY) - COUNT(DISTINCT CITY)
FROM
    STATION;
