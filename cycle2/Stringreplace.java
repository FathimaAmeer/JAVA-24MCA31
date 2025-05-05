
import java.util.Scanner;

	public class Stringreplace {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the original string: ");
	        String text = scanner.nextLine();

	        System.out.print("Enter the pattern to search: ");
	        String pattern = scanner.nextLine();

	        System.out.print("Enter the replacement string: ");
	        String replacement = scanner.nextLine();

	       
	        String modifiedText = text.replaceAll(pattern, replacement);

	        
	        System.out.println("Modified string: " + modifiedText);

	        scanner.close();
	    }
	}