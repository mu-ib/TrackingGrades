/**
 * Muhammad Ibrahim
 * Tracking Grades Lab
 * 2 October 2020
 * EXTRA: Ask the user how many tests and how many students AND use a two dimensional array to run through the program
 **/

import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        //create test arrays after asking how many tests were taken and how many students there are
        System.out.print("How many students will you be inputting information for?    ");
        int studentNumber = s.nextInt();
        System.out.print("How many tests do you want to get the average of from each student?    ");
        int testNumber = s.nextInt();
        double[][] studentData = new double[studentNumber][testNumber];

        //for loop going through the two dimensional array asking for student scores
        for(int i = 0; i < studentData.length; i++) {
            //Ask the user for information about the student
            System.out.print("\nFirst name of student " + (i+1) + ":    ");
            String name = s.next();
            Student student = new Student(name);
            System.out.println("Enter " + student.name + "'s scores:");

            //for loop to ask for test scores
            for (int j = 0; j < studentData[i].length; j++) {
                System.out.print((j + 1) + ":    ");
                double score = s.nextDouble();
                if(score >= 0 && score <= 100)
                    studentData[i][j] = score;
                else{
                    System.out.println("Not an acceptable score. Please enter a number between 0 and 100.");
                    j--;
                }

            }
            //input the students grades
            student.inputGrades(studentData);

            //print average for the student
            System.out.println(student + "" + student.getAverage(i));
        }
    }
}
