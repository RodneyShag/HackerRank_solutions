--     Author: Rodney Shaghoulian
--     Github: github.com/rshaghoulian
-- HackerRank: hackerrank.com/rshaghoulian

SELECT DISTINCT CITY FROM STATION
WHERE ID % 2 = 0;
 
-- Or 
-- select distinct city from station where Mod(ID,2)=0; 
 
 
