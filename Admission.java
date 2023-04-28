import java.util.Scanner;

public class AdmissionModule {
public static void admission() {
Scanner scanner = new Scanner(System.in);
    System.out.println("\nWelcome to the admission process.");
    System.out.print("Please enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Please enter your age: ");
    int age = scanner.nextInt();
    scanner.nextLine(); // consume the remaining newline character

    System.out.print("Please enter your gender (M/F): ");
    char gender = scanner.nextLine().charAt(0);

    System.out.print("Please enter your contact number: ");
    String contactNumber = scanner.nextLine();

    System.out.print("Please enter your email address: ");
    String email = scanner.nextLine();

    System.out.print("Please enter your address: ");
    String address = scanner.nextLine();

    System.out.println("\nThank you for your details, " + name + ".");
    System.out.println("Your admission request is being processed.");

    // Code for admission process goes here, such as verifying eligibility criteria, generating an admission number, etc.
    
    // Check if the student meets the eligibility criteria
    if(age >= 18 && age <= 30 && (gender == 'M' || gender == 'F')) {
        System.out.println("You meet the eligibility criteria.");

        // Generate an admission number
        int admissionNumber = (int)(Math.random() * 10000);
        System.out.println("Your admission number is " + admissionNumber + ".");
        
        // Add the student's details to the hostel database
        HostelDatabase.addStudent(name, age, gender, contactNumber, email, address, admissionNumber);
        
        System.out.println("Your admission has been approved. Please pay the admission fees to confirm your seat.");
    } else {
        System.out.println("You do not meet the eligibility criteria. Your admission request has been rejected.");
    }
}
