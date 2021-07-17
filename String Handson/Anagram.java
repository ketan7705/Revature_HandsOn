 
package HandsOn;
import java.util.Arrays;
import java.util.Scanner; 
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the Second String : ");
		String str2 = sc.nextLine();
		
		// Converting both the string to lower case.
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Checking for the length of strings
		if (str1.length() != str2.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			// Converting both the arrays to character array
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();

			// Sorting the arrays using in-built function sort ()
			Arrays.sort(string1);
			Arrays.sort(string2);

			// Comparing both the arrays using in-built function equals ()
			if (Arrays.equals(string1, string2) == true) {
				System.out.println("Yupppy..!! The strings are Anagram");
			} else {
				System.out.println("Huhhh...!! The strings are not Anagram");
			}
		}
	}

}
