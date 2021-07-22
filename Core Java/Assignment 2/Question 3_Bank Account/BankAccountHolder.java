package assignment.second.java.third_Question.BankAccount;

public abstract class BankAccountHolder {
	int id;
	String name;
	double balance;
	
	public BankAccountHolder(int id, String name, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Double getBalance() {
		return balance;
	}



	public void setBalance(Double balance) {
		this.balance = balance;
	}



	public abstract double toFindCashInBank();
	
	

}
