package anagram1;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {

		        // Create a Scanner object for user input
		        Scanner input = new Scanner(System.in);

		        // Take input from users
		        System.out.print("Enter first String: ");
		        String str1 = input.nextLine();
		        System.out.print("Enter second String: ");
		        String str2 = input.nextLine();

		        // Check if the lengths are the same
		        if (str1.length() == str2.length()) {
		            // Convert strings to char arrays
		            char[] charArray1 = str1.toCharArray();
		            char[] charArray2 = str2.toCharArray();

		            // Sort the char arrays
		            Arrays.sort(charArray1);
		            Arrays.sort(charArray2);

		            // Check if sorted char arrays are equal
		            boolean result = Arrays.equals(charArray1, charArray2);

		            if (result) {
		                System.out.println(str1 + " and " + str2 + " are anagrams.");
		            } else {
		                System.out.println(str1 + " and " + str2 + " are not anagrams.");
		            }
		        } else {
		            System.out.println(str1 + " and " + str2 + " are not anagrams.");
		        }

		        // Close the Scanner
		        input.close();
		    }
		}