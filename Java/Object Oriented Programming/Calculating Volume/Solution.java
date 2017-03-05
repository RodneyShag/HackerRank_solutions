//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

// This is not a well-designed question. I recommend skipping this problem. 
// The provided code requires a very specific and unconventional interface that 
// the Calculate class needs to follow. A working solution is provided below.

class Calculate {
    static Scanner scan = new Scanner(System.in);
    static Output output = new Output();

    public static Calculate do_calc() {
        return new Calculate();
    }
    
    public int get_int_val() throws IOException, NumberFormatException {
        int x = scan.nextInt();
        if (x <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return x;
    }
    
    public double get_double_val() throws IOException, NumberFormatException  {
        double x = scan.nextDouble();
        if (x <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return x;
    }
    
    public double get_volume(int a) { // cube
        return a * a * a;
    }
    
    public double get_volume(int l, int b , int h) { // cuboid
        return l * b * h;
    }
    
    public double get_volume(double r) { // hemisphere
        return (2 * Math.PI * r * r * r) / 3;
    }
    
    public double get_volume(double r, double h) { // cylinder
        return  Math.PI * (r * r) * h;
    }
    
    static void display (double value) {
        System.out.println(value);
    }
}

class Output {
    void display(double value) {
        System.out.format("%.3f%n", value);
    }
}
