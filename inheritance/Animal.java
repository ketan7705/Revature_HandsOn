package inheritance;

public abstract class Animal {

	String picture;
	String foods;
	int hunger;
	int boundaries;
	String location;
	
	public void sleep() {
		System.out.println("All animal sleep");
	}
	
	abstract void makeNoise();

	abstract void eat();

	abstract void roam();

	abstract class Feline extends Animal implements Breed{

		@Override
		void roam() {
			// TODO Auto-generated method stub
			System.out.println("Feline roam");
		}

		class Lion extends Feline {
			@Override
			void makeNoise() {
				// TODO Auto-generated method stub
				System.out.println("Lion makes noise");
			}

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("Lion will eat");
			}
			
			@Override
			public void foodType() {
				// TODO Auto-generated method stub
				System.out.println("Eats only Non veg");
			}
		}

		class Tiger extends Feline{
			@Override
			void makeNoise() {
				// TODO Auto-generated method stub
				System.out.println("Tiger Makes Noise");
			}

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("Tiger will eat");
			}

			@Override
			public void foodType() {
				// TODO Auto-generated method stub
				System.out.println("Eats only Non veg");
			}
		}
		class Cat extends Feline{
			@Override
			void makeNoise() {
				// TODO Auto-generated method stub
				System.out.println("Cats Makes Noise");	
			}

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("Cats will eat");	
			}

			@Override
			public void foodType() {
				// TODO Auto-generated method stub
				System.out.println("Eats Veg or Non Veg");
			}
		}
	}
		
	abstract class Hippo extends Animal implements Breed {

		@Override
		void makeNoise() {
			// TODO Auto-generated method stub
			System.out.println("Hippo is making noise");
		}

		@Override
		void eat() {
			// TODO Auto-generated method stub
			System.out.println("Hippo will eat");
		}

		@Override
		void roam() {
			// TODO Auto-generated method stub
			System.out.println("Hippo roam");
		}
		void fooDType() {
			System.out.println("Eats only Non veg");
		}
		
	}

	abstract class Canine extends Animal implements Breed {


		@Override
		void roam() {
			// TODO Auto-generated method stub
			System.out.println("Canine roam");
		}
		class Dog extends Canine{

			@Override
			void makeNoise() {
				// TODO Auto-generated method stub
				System.out.println("Dog is making noise");
			}

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("Dog will eat");
			}

			@Override
			public void foodType() {
				// TODO Auto-generated method stub
				System.out.println("Eats Pedigree");
			}
			
		}
		class Wolf extends Canine{

			@Override
			void makeNoise() {
				// TODO Auto-generated method stub
				System.out.println("Wolf is making noise");
			}

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("Wolf will eat");
			}

			@Override
			public void foodType() {
				// TODO Auto-generated method stub
				System.out.println("Eats only Non veg");
			}
			
		}
		
	}

}

