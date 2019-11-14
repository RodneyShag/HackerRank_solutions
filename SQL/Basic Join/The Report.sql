-- github.com/RodneyShag

SELECT IF (S.Marks < 70, 'NULL', S.Name), G.Grade, S.Marks
FROM Students AS S, Grades AS G
WHERE S.Marks BETWEEN G.Min_Mark AND G.Max_Mark
ORDER BY G.GRADE DESC, S.NAME;
