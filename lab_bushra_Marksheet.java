package lab2_software_construction_dvelopment;

import java.util.Scanner;

public class lab_bushra_Marksheet {

    // Inner class to represent a Marksheet
    static class Marksheet {
        private String studentName;
        private double totalMarks;
        private double obtainedMarks;
        private double percentage;
        private String grade;
        private double gpa;

        // Constructor to initialize the Marksheet with student data
        public Marksheet(String studentName, double totalMarks, double obtainedMarks) {
            this.studentName = studentName;
            this.totalMarks = totalMarks;
            this.obtainedMarks = obtainedMarks;
            this.percentage = calculatePercentage();
            this.grade = calculateGrade();
            this.gpa = calculateGPA();
        }

        // Method to calculate the percentage
        private double calculatePercentage() {
            return (obtainedMarks / totalMarks) * 100;
        }

        // Method to calculate the grade based on the percentage
        private String calculateGrade() {
            if (percentage >= 90) {
                return "A+";
            } else if (percentage >= 80) {
                return "A";
            } else if (percentage >= 70) {
                return "B+";
            } else if (percentage >= 60) {
                return "B";
            } else if (percentage >= 50) {
                return "C";
            } else if (percentage >= 40) {
                return "D";
            } else {
                return "F";
            }
        }

        // Method to calculate GPA based on the grade
        private double calculateGPA() {
            switch (grade) {
                case "A+":
                    return 4.0;
                case "A":
                    return 3.7;
                case "B+":
                    return 3.3;
                case "B":
                    return 3.0;
                case "C":
                    return 2.0;
                case "D":
                    return 1.0;
                default:
                    return 0.0;
            }
        }

        // Method to display the mark sheet in a formatted way
        public void displayMarksheet() {
            System.out.println("\n--- Mark Sheet ---");
            System.out.println("Student Name  : " + studentName);
            System.out.println("Total Marks   : " + totalMarks);
            System.out.println("Obtained Marks: " + obtainedMarks);
            System.out.printf("Percentage    : %.2f%%\n", percentage);
            System.out.println("Grade         : " + grade);
            System.out.println("GPA           : " + gpa);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking runtime inputs from the user
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter total marks: ");
        double totalMarks = scanner.nextDouble();
        System.out.print("Enter obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        // Creating a Marksheet object with user inputs
        Marksheet marksheet = new Marksheet(studentName, totalMarks, obtainedMarks);

        // Displaying the marksheet
        marksheet.displayMarksheet();

        // Close the scanner
        scanner.close();
    }
}
