package G_OOPS;
// Example when i should use setters getters and where constructors
// Answar-------->
// Suppose you are designing a BankAccount class in Java to represent a customer's bank account. The class has three private instance variables: accountNumber, balance, and accountType.

//1}Constructors:-
//You would use a constructor to initialize the accountNumber, balance, and accountType instance variables when a new BankAccount object is created.
 //---------------------------------
//Setters:
//You would use setters to modify the balance instance variable when a transaction occurs, such as a deposit or withdrawal. 
                                   
//Getters:
//You would use getters to retrieve the values of the accountNumber, balance, and accountType instance variables when displaying account information to the user.

//----------------------------
class BankAccount{
	private int accountNumber ;
	private double balance;
	private String accountType ;
	
	public BankAccount(int accountNumber , int balance , String accountType) {
		this.accountNumber=accountNumber;
		this.balance =balance ;
		this.accountType=accountType ;
	} 
	
	public void deposit(double amount) {
	    this.balance += amount;
	}
    
	public void withdraw(double amount) {
	    if (balance >= amount) {
	        this.balance -= amount;
	    } else {
	        System.out.println("Insufficient balance");
	    }
	}
     
	public void setBalance(double balance) {
	    this.balance = balance;
	}
	
	//getters
	public int getAccountNumber() {
	    return accountNumber;
	}

	public double getBalance() {
	    return balance;
	}

	public String getAccountType() {
	    return accountType;
	}

	
}
public class ConstructorVsSetterGetter{
	public static void main(String[] args) {
	  // Creating a new BankAccount object using constructor
	  BankAccount ba = new BankAccount(45522455, 1000000, "Saving");
	  System.out.println("Account number " + ba.getAccountNumber());
	  System.out.println("Account balance "+ ba.getBalance());
	  System.out.println("Account type "+ ba.getAccountType());
	   
	  //Deposit money
	  ba.deposit(45120);
	  
	  System.out.println("Account balance "+ ba.getBalance());
	  
	  ba.withdraw(45120);
	  System.out.println("Account balance "+ ba.getBalance());
	}
	
}

//Overall, constructors are used to initialize instance variables when an object is created, setters are used to modify instance variables when an action is performed, and getters are used to retrieve instance variable values when displaying information to the user.
