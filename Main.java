import java.util.Scanner;

public class HostelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nHostel Management System");
            System.out.println("------------------------");
            System.out.println("1. Admission");
            System.out.println("2. Fee Payment");
            System.out.println("3. Room Allotment");
            System.out.println("4. Grievances");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    admission();
                    break;
                case 2:
                    feePayment();
                    break;
                case 3:
                    roomAllotment();
                    break;
                case 4:
                    grievances();
                    break;
                case 0:
                    System.out.println("Exiting Hostel Management System");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    public static void admission() {
        System.out.println("Admission process initiated.");
        // Code for admission process goes here
    }

    public static void feePayment() {
        System.out.println("Fee payment process initiated.");
        // Code for fee payment process goes here
    }

    public static void roomAllotment() {
        System.out.println("Room allotment process initiated.");
        // Code for room allotment process goes here
    }

    public static void grievances() {
        System.out.println("Grievance process initiated.");
        // Code for grievance handling goes here
    }
}
