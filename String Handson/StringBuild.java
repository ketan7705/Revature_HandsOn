package HandsOn;

public class StringBuild {
	public static void main(String[] args) {
		String names[] = {"Ketan","Prasad","Rushikesh","Pratik","Mayuresh",
				"Dhruv","Yash","Niraj","Nikhil","Rutuja"};
		String z = String.join(" ", names);
		System.out.println("Converting to String : "+z);
	}
}
