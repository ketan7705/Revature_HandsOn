package ExcepHandHandson;

public class Registratar {
	Registratar() {
		
	}
	
	public void getRegistrar() throws RegistrationException{
		Student s = new Student();
		RegistrationForm r =new RegistrationForm();
		
		if(s.equals(r)) {
			System.out.println("Details are incorrect");
		}
		else {
			System.out.println("Details are match");
			throw new RegistrationException("Details are match");
		}
	}
}
