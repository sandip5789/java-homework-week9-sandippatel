package homeworkweek9;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 * Created by Sandip Patel
 */

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        // Declare scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter roll number: ");
        int rollNo = scanner.nextInt();
        System.out.println();

        int mathsMarks, scienceMarks, englishMarks;
        do {
            System.out.println("Enter Math marks (0-100): ");
            mathsMarks = scanner.nextInt();
            if (mathsMarks < 0 || mathsMarks > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            }
        } while (mathsMarks < 0 || mathsMarks > 100);

        do {
            System.out.println("Enter English marks (0-100): ");
            scienceMarks = scanner.nextInt();
            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            }

        } while (scienceMarks < 0 || scienceMarks > 100);

        do {
            System.out.println("Enter English marks (0-100): ");
            englishMarks = scanner.nextInt();
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            }
        } while (englishMarks < 0 || englishMarks > 100);

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        ;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNo, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        scanner.close();

    }

    //calculating the sun
    public static int sum(int a, int b, int c) {
        return a + b + c;

    }

    // Calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;

    }

    // Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks, double total, double percentage, String result, String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }

}
