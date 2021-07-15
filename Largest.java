package HandsOn;

public class Largest {
	public void largest() {
		int num[] = { 45, 69, 10 };
		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max)
				max = num[i];
		}
		System.out.println("Largest element present in array: " + max);
	}

	public static void main(String[] args) {
		Largest l = new Largest();
		l.largest();

	}
}
