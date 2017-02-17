//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

class Student extends Person{
    private int[] testScores;

    /*  
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    public Student(String firstName, String lastName, int id, int [] scores) {
        super(firstName, lastName, id);
        testScores = scores;
    }

    /*  
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate() {
        double average = 0;
        for (int score : testScores) {
            average += score;
        }
        average /= testScores.length;
        
        if  (average >= 90) {
            return 'O';
        }
        else if (average >= 80) {
            return 'E';
        }
        else if (average >= 70) {
            return 'A';
        }
        else if (average >= 55) {
            return 'P';
        }
        else if (average >= 40) {
            return 'D';
        }
        else {
            return 'T';
        }
    }
}
