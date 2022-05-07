package reservation;

public class Passenger extends BankAccount		/*class Passenger extends BankAccount so it's object can 
												access methods of BankAccount class*/
{
	private int pId;
	private String pName;
	private int age;
	private char gender;
	
	//Parametarized constructor of Passenger class
	public Passenger(int pId, String pName, int age, char gender) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.age = age;
		this.gender = gender;
	}

	//Getters-Setters
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
}
