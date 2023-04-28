import java.util.Scanner;
System.out.println("\nWelcome to the room allotment process.");
    System.out.print("Please enter your admission number: ");
    int admissionNumber = scanner.nextInt();
    scanner.nextLine(); // consume the remaining newline character

    // Check if the admission number is valid and retrieve the student details
    Student student = null; // initialize student object to null
    boolean isAdmissionNumberValid = false;
    while (!isAdmissionNumberValid) {
        student = getStudentByAdmissionNumber(admissionNumber); // retrieve student details based on admission number
        if (student != null) {
            isAdmissionNumberValid = true;
        } else {
            System.out.println("Invalid admission number. Please try again.");
            System.out.print("Please enter your admission number: ");
            admissionNumber = scanner.nextInt();
            scanner.nextLine(); // consume the remaining newline character
        }
    }

    // Display student details
    System.out.println("Welcome " + student.getName() + ".");
    System.out.println("Your current room preference is: " + student.getRoomPreference());
public class RoomAllotmentModule {
public static void roomAllotment() {
Scanner scanner = new Scanner(System.in);
    
// Prompt user to select room preference
    System.out.println("Please select your room preference: ");
    System.out.println("1. Single room");
    System.out.println("2. Double room");
    System.out.println("3. Triple room");
    int roomPreference = scanner.nextInt();
    scanner.nextLine(); // consume the remaining newline character

    // Check if the room preference is valid and update the hostel database
    boolean isRoomPreferenceValid = false;
    while (!isRoomPreferenceValid) {
        if (roomPreference < 1 || roomPreference > 3) {
            System.out.println("Invalid room preference. Please try again.");
            System.out.println("Please select your room preference: ");
            System.out.println("1. Single room");
            System.out.println("2. Double room");
            System.out.println("3. Triple room");
            roomPreference = scanner.nextInt();
            scanner.nextLine(); // consume the remaining newline character
        } else {
            updateHostelDatabase(student, roomPreference);
            isRoomPreferenceValid = true;
        }
    }

    System.out.println("Your room has been allotted. Thank you.");
}

// Method to retrieve student details based on admission number
private static Student getStudentByAdmissionNumber(int admissionNumber) {
    // Code for retrieving student details based on admission number goes here
    // Return null if the admission number is not found
    return null;
}

// Method to update hostel database with the new room preference
private static void updateHostelDatabase(Student student, int roomPreference) {
    // Code for updating the hostel database with the new room preference goes here
}
