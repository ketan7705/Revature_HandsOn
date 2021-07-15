package HandsOn;

public class EnhancedFor {
	public void display() {
		int number[] = {10,20,30,45,50};
		int add=0;
		for(int temp:number) {
			add=add+temp;
		}
		System.out.println("Result of additon: "+add);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnhancedFor add = new EnhancedFor();
		add.display();
	}

}
