import java.util.Scanner;

public class Traffic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Vehicle Speed (km/h): ");
        int speed = sc.nextInt();

        System.out.print("Enter Speed Limit (km/h): ");
        int speedLimit = sc.nextInt();

        System.out.print("Enter Driver Age: ");
        int age = sc.nextInt();

        System.out.print("Helmet Status (1 = Valid, 0 = Violation): ");
        int helmet = sc.nextInt();

        System.out.print("Seat Belt Status (1 = Valid, 0 = Violation): ");
        int seatBelt = sc.nextInt();

        System.out.print("Valid License (1 = Yes, 0 = No): ");
        int license = sc.nextInt();

        System.out.print("Emergency Vehicle (1 = Yes, 0 = No): ");
        int emergency = sc.nextInt();

        System.out.print("Violation Status (1 = Violation, 0 = No Violation): ");
        int violationStatus = sc.nextInt();

        // Variables
        int excessSpeed = speed - speedLimit;
        int fine = 0;
        int violationFlags = 0;

        // Speed violation
        boolean overSpeed = speed > speedLimit;

        // Driver age violation
        boolean ageViolation = age < 18;

        // Helmet violation
        boolean helmetViolation = helmet == 0;

        // Seat belt violation
        boolean seatBeltViolation = seatBelt == 0;

        // License violation
        boolean licenseViolation = license == 0;

        /*
         * Emergency vehicles are exempt from speed violation.
         */
        if (emergency == 1) {
            overSpeed = false;
            excessSpeed = 0;
        }

        // Calculate fine
        if (overSpeed) {
            if (excessSpeed <= 10) {
                fine += 500;
            } else if (excessSpeed <= 20) {
                fine += 1000;
            } else {
                fine += 1500;
            }

            violationFlags += 1;
        }

        // Helmet fine
        if (helmetViolation && emergency == 0) {
            fine += 500;
            violationFlags += 2;
        }

        // Seat belt fine
        if (seatBeltViolation && emergency == 0) {
            fine += 500;
            violationFlags += 4;
        }

        // License fine
        if (licenseViolation) {
            fine += 1000;
            violationFlags += 8;
        }

        // Age violation
        if (ageViolation) {
            fine += 500;
            violationFlags += 16;
        }

        // Manual violation status
        if (violationStatus == 1) {
            violationFlags += 32;
        }

        // Risk level
        String riskLevel;

        if (violationFlags == 0) {
            riskLevel = "LOW";
        } else if (fine <= 1000) {
            riskLevel = "MEDIUM";
        } else {
            riskLevel = "HIGH";
        }

        // Output
        System.out.println();
        System.out.println("==========================================");
        System.out.println("       SMART TRAFFIC ANALYZER");
        System.out.println("==========================================");

        System.out.println("Vehicle Number   : " + vehicleNumber);
        System.out.println("Speed            : " + speed + " km/h");
        System.out.println("Speed Limit      : " + speedLimit + " km/h");

        if (excessSpeed > 0) {
            System.out.println("Excess Speed     : " + excessSpeed + " km/h");
        } else {
            System.out.println("Excess Speed     : 0 km/h");
        }

        System.out.println();

        if (overSpeed) {
            System.out.println("Speed Status     : OVER SPEED");
        } else {
            System.out.println("Speed Status     : NORMAL");
        }

        if (helmet == 1) {
            System.out.println("Helmet Status    : VALID");
        } else {
            System.out.println("Helmet Status    : VIOLATION");
        }

        if (seatBelt == 1) {
            System.out.println("Seat Belt Status : VALID");
        } else {
            System.out.println("Seat Belt Status : VIOLATION");
        }

        if (license == 1) {
            System.out.println("License Status   : VALID");
        } else {
            System.out.println("License Status   : INVALID");
        }

        System.out.println();

        System.out.println("Total Fine       : ₹" + fine);
        System.out.println("Risk Level       : " + riskLevel);
        System.out.println("Violation Flags  : " + violationFlags);

        System.out.println("==========================================");

        sc.close();
    }
}