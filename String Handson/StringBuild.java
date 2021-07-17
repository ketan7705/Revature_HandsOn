package HandsOn;

public class StringBuild {
	public static void main(String[] args) {
		String names[] = {"Ketan","Prasad","Rushikesh","Pratik","Mayuresh",
				"Dhruv","Yash","Niraj","Nikhil","Rutuja"};
		StringBuilder a=new StringBuilder();
		for(String x:students){
			a.append(x+" ");
		}
		System.out.println(a);
	}
}
