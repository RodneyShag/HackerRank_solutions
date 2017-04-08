--     Author: Rodney Shaghoulian
--     Github: github.com/rshaghoulian
-- HackerRank: hackerrank.com/rshaghoulian

SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP '[aeiou]$';

--  Pattern   | What the pattern matches
---------------------------------------
--    $       |  End of string
--  [...]     |  Any character listed between the square brackets

-- Useful Reference: https://www.tutorialspoint.com/mysql/mysql-regexps.htm
