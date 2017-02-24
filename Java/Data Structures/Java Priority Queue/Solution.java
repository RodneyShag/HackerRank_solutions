//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

class Student{
    private String fname;
    private double cgpa;
    private int token;
    public Student(String fname, double cgpa, int token) {
        this.fname = fname;
        this.cgpa = cgpa;
        this.token = token;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        /* Create PriorityQueue and add/remove entries */
        PriorityQueue<Student> pq = new PriorityQueue<>(n, new StudentComparator());
        while (n-- > 0) {
            String event = scan.next();
            switch (event) {
                case "ENTER":
                    String fname = scan.next();
                    double cgpa  = scan.nextDouble();
                    int    token = scan.nextInt();
                    pq.add(new Student(fname, cgpa, token));
                    break;
                case "SERVED":
                    pq.poll();
                    break;
                default:
                    break;
            } 
        }
        scan.close();
        
        /* Print Student names */
        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while ( ! pq.isEmpty()) {
                Student s = pq.remove();
                System.out.println(s.getFname());
            }
        }
    }
}

class StudentComparator implements Comparator<Student> {
    double epsilon = 0.001; // since we shouldn't use "==" with doubles
    @Override
    public int compare(Student s1, Student s2) {
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > epsilon) {
            return s1.getCgpa() < s2.getCgpa() ? 1 : -1; // descending order
        } else if ( ! s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        } else {
            return s1.getToken() - s2.getToken();
        }
    }
}
