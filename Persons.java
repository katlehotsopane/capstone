// poisedProject.java
// written by: katleho tsopane
// Date: 29/07/2020
// function: this part of the program is of created methods that will be called or implemented in 'Main.java'


public class Persons {
	
	// declaring private variables
	private String name;
	private String surname;
	private String telNum;
	private String emailAddress; 
	private String homeAddress;
	

	
	// creating a method called 'Persons' with parameters
	public Persons(String name, String surname, String telNum, String emailAddress, String homeAddress) {
		
		this.name = name;
		this.surname = surname;
		this.telNum = telNum;
		this.emailAddress = emailAddress;
		this.homeAddress = homeAddress;
	}
	
	// creating a method called 'getName'
	// which returns 'name'
	public String getName() {
		return name;
	}

	// creating a method called 'setName' with parameter 'name'
	// which is equated to 'name'
	public void setName(String name) {
		this.name = name;
	}
	
	// creating a method called 'getTelNum'
	// which returns 'telNum'
	public String getTelNum() {
		return telNum;
	}
	
	// creating a method called 'setTelNum' with parameter 'telNum'
	// which is equated to 'telNum'
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
	// creating a method called 'getEmailAddress'
	// which returns 'emailAddress'
	public String getEmailAddress() {
		return emailAddress;
	}
	
	// creating a method called 'setHomeAddress' with parameter 'homeAddress'
	// which is equated to 'homeAddress'
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	// creating a 'toString' method
	// which returns the client's details
	@Override
	public String toString() {
		
		return "Name:	" + name + 
				"\nSurname:	" + surname + 
				"\nTelephone Number:	" + telNum + 
				"\nEmail Address:	" + emailAddress + 
				"\nHome Address:	" + homeAddress;
	}

	// creating a method called 'setEmailAddress' with parameter 'nextLine'
	// which is equated to 'emailAddress'
	public void setEmailAddress(String nextLine) {
		this.emailAddress = nextLine;
	}

	// creating a method called 'setSurname' with parameter 'nextLine'
	// which is equated to 'surname'
	public void setSurname(String nextLine) {
		this.surname = nextLine;
	}

}