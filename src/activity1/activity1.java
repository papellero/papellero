/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            String name;
            int subjects;
      
            System.out.print("Enter student name: ");
            name = sc.nextLine();
            
            System.out.print("Enter number of subjects: ");
            subjects = sc.nextInt();
            int total = 0;
            
            for (int i = 1; i <= subjects; i++) {
                System.out.print("Enter grade for subject " + i + ": ");
                double grade = sc.nextDouble();
                total += grade;
            } int average = total / subjects;
            
            System.out.println("\nStudent Name: " + name);
            System.out.println("Average Grade: " + average);
            
            
            if (average >= 75) {
                System.out.println("Remarks: Passed");
            } else {
                System.out.println("Remarks: Failed");
            }
        }
    }
}