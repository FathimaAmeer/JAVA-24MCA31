import java.util.Scanner;

// Custom Exception for Invalid Phone Number
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

public class PhoneNumberValidator {
    
    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        
        try {
            validatePhoneNumber(phoneNumber);
            System.out.println("Phone number is valid.");
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Invalid Phone Number: " + e.getMessage());
        }
        
        scanner.close();
    }
}
