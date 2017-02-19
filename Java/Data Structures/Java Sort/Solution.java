//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases-- > 0) {
            int id       = scan.nextInt();
            String fname = scan.next();
            double cgpa  = scan.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
        }
        scan.close();

        Collections.sort(studentList, new StudentComparator());
        
        for (Student st: studentList) {
            System.out.println(st.getFname());
        }
    }
}

class StudentComparator implements Comparator<Student> {
    double epsilon = 0.001; // since we shouldn't use "==" with doubles
    @Override
    public int compare(Student s1, Student s2) {
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > epsilon) {
            return s1.getCgpa() < s2.getCgpa() ? 1 : -1; // descending order
        } else if (!s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        } else {
            return s1.getId() - s2.getId();
        }
    }
}
