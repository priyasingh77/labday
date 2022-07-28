/*
Program to create Bank account and check balance.
*/
class Bank
{
public static void main(String args[])
{
	int amount=7000,accountNumber=4587992,accountBalance=5000;
	String customerName= "vishu";
	customerDetails customer1 = new customerDetails();				
	customer1.createAccount(accountNumber,customerName,accountBalance);		//Method call from customerclass.
	customer1.getAmount();
	customer1.depositAmount(amount);
	customer1.getAmount();
	customer1.withdrawAmount(amount);
	customer1.getAmount();
}
}

class customerDetails{
	//creating instance variable
	private int accNumber,accBalance;
	private String accHolderName;
	
	//creating method createAccount to store the details of customer
	public void createAccount(int accountNumber,String customerName,int accountBalance){
		
		 accNumber= accountNumber;
		 accHolderName = customerName;
		 accBalance= accountBalance;
	}

	//creating method depositAmount to add amount
	
	public void depositAmount(int amount){
		accBalance += amount;
		System.out.println("you are depositing." +amount);
	}
	
	//creating method to withdraw 
	public void withdrawAmount(int amount)
	{
	accBalance -= amount;
	System.out.println("you are withdrawing" +amount);
	}
	
	//Creating method getAmount to display customer details
	public void getAmount(){
	 System.out. println(accHolderName+" Sir You Have "+accBalance+" in Your Account");
}
	}

