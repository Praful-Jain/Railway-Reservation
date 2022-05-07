package reservation;

public class BankAccount {
	private int accNumber;
	private int accBalance=10000;
	
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	
	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	
	//we have not made it static because of security constraints
	public void deposit(int amount)
	{	accBalance+=amount;		}
	
	public void withdrawl(int amount)
	{
		accBalance-=amount;
	}
	public void showBalance()
	{
		System.out.println("Account balance- "+accBalance);
	}
	
	
	
	
}
