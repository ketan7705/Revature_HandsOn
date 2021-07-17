package HandsOn;

public class StringApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "The quick brown fox jumps over the lazy dog";
		System.out.println("The character at 12th index is : " + m.charAt(12));
		System.out.println("If 'is' is contain : " + m.contains("is"));
		String n = " and killed it";
		System.out.println("th Concatination : " + m.concat(n));
		System.out.println("ends with : " + m.endsWith("dog"));
		String o = "The quick brown Fox jumps over the lazy Dog";
		System.out.println("Check the Two String : " + m.equals(o));
		String q = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		System.out.println("Check the Two String with case : " + m.equals(q));
		System.out.println("Check the Two String without case: " + m.equalsIgnoreCase(q));
		System.out.println("The length of the String : " + m.length());
		System.out.println("Replace the specific word : " + m.replace("The", "A"));
		String[] z = m.split("jumps", 2);
		for (String e : z) {
			System.out.println("split : " + e);
		}
		System.out.println("separate animal : "+m.substring(15,19)+m.substring(39,43));
		System.out.println("To lower case : "+m.toLowerCase());
		System.out.println("To Upper case : "+m.toUpperCase());
		System.out.println("'a' is at location : "+m.indexOf("a") );
		System.out.println("'a' is at location : "+m.lastIndexOf("e") );
	}
}
