import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        double subject1 = sc.nextDouble();

        System.out.print("Enter marks in Subject 2: ");
        double subject2 = sc.nextDouble();

        System.out.print("Enter marks in Subject 3: ");
        double subject3 = sc.nextDouble();

        double total = subject1 + subject2 + subject3;

        double average = total / 3;

        boolean passed = subject1 >= 40 &&
                         subject2 >= 40 &&
                         subject3 >= 40;

        boolean distinction = passed && average >= 75;

        boolean specialAward = passed &&
                               average >= 90 &&
                               subject1 >= 85 &&
                               subject2 >= 85 &&
                               subject3 >= 85;

        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Subject 1 Marks: " + subject1);
        System.out.println("Subject 2 Marks: " + subject2);
        System.out.println("Subject 3 Marks: " + subject3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (passed) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        if (distinction) {
            System.out.println("Distinction: YES");
        } else {
            System.out.println("Distinction: NO");
        }

        if (specialAward) {
            System.out.println("Special Award: YES");
        } else {
            System.out.println("Special Award: NO");
        }

        sc.close();
    }
}