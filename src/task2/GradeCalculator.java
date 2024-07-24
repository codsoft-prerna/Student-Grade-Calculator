package task2;




		import java.util.Scanner;

		public class GradeCalculator {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Welcome to the Student Grade Calculator!");

		        // Prompt the user to enter the number of subjects
		        System.out.print("Enter the number of subjects: ");
		        int numSubjects = scanner.nextInt();

		        // Arrays to store marks and grades
		        int[] marks = new int[numSubjects];
		        char[] grades = new char[numSubjects];

		        // Prompt the user to enter marks for each subject
		        for (int i = 0; i < numSubjects; i++) {
		            System.out.print("Enter marks for subject " + (i + 1) + ": ");
		            marks[i] = scanner.nextInt();

		            // Calculate grade based on marks
		            grades[i] = calculateGrade(marks[i]);
		        }

		        // Calculate total marks
		        int totalMarks = 0 ;
		        for (int mark : marks) {
		            totalMarks += mark;
		        }

		        // Calculate average percentage
		        double averagePercentage = (double) totalMarks / numSubjects;

		        // Display total marks and average percentage
		        System.out.println("Total Marks: " + totalMarks);
		        System.out.println("Average Percentage: " + averagePercentage + "%");

		        // Display encouraging message based on grades
		        System.out.println("\nEncouraging Messages:");

		        for (int i = 0; i < numSubjects; i++) {
		            System.out.println("Subject " + (i + 1) + ": " + getMessage(grades[i]));
		        }

		        scanner.close();
		    }

		    // Method to calculate grade based on marks
		    public static char calculateGrade(int marks) {
		        if (marks >= 90) {
		            return 'A';
		        } else if (marks >= 80) {
		            return 'B';
		        } else if (marks >= 70) {
		            return 'C';
		        } else if (marks >= 60) {
		            return 'D';
		        } else {
		            return 'F';
		        }
		    }

		    // Method to get encouraging message based on grade
		    public static String getMessage(char grade) {
		        switch (grade) {
		            case 'A':
		                return "Excellent! Keep up the good work!";
		            case 'B':
		                return "Well done! You're doing great!";
		            case 'C':
		                return "Good job! Keep improving!";
		            case 'D':
		                return "Not bad! Keep working hard!";
		            case 'F':
		                return "You can do better! Keep studying!";
		            default:
		                return "Invalid grade";
		        }
		    }
		}
