package BankAccountApp;

public class Savings extends Account {
	
	//List properties specific to savings account 
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	
	//Constructor to initialize Settings for saving account
	public Savings(String name,String sSN,double initDeposit){
		super(name,sSN,initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
		}
	
	public void setRate(){
		rate=getBaseRate()-.25;
	}
	
	private void setSafetyDepositBox()
	{
		safetyDepositBoxID=(int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey=(int)(Math.random()*Math.pow(10, 4));
	}
	
	//List any method specific to savings
	public void showInfo(){
		System.out.println("ACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println( 
				"Your Saving Account Features" +
		        "\nSafety Deposit Box ID: "+ safetyDepositBoxID+
		        "\nSafety Deposit Box Key: "+ safetyDepositBoxKey
				);
	}
}
