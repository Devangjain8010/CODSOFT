import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Declare variables to store marks
        int sub1, sub2, sub3, sub4, sub5;
        int totalMarks;
        double average;
        String grade = ""; // Declare grade as a String

        // Get marks from user for 5 subjects
        System.out.println("Enter marks for Subject 1 (out of 100): ");
        sub1 = sc.nextInt();

        System.out.println("Enter marks for Subject 2 (out of 100): ");
        sub2 = sc.nextInt();

        System.out.println("Enter marks for Subject 3 (out of 100): ");
        sub3 = sc.nextInt();

        System.out.println("Enter marks for Subject 4 (out of 100): ");
        sub4 = sc.nextInt();

        System.out.println("Enter marks for Subject 5 (out of 100): ");
        sub5 = sc.nextInt();

        // Calculate total marks
        totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;

        // Calculate average percentage
        average = totalMarks / 5.0;

        // Determine grade based on average
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the total marks, average percentage, and grade
        System.out.println("Total Marks: " + totalMarks + " out of 500");
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);
    }
}
