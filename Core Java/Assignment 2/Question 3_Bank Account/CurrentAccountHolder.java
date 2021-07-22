package assignment.second.java.third_Question.BankAccount;

public class CurrentAccountHolder extends BankAccountHolder {
	double cashCredits = 20000;

	public CurrentAccountHolder(int id, String name, double balance) {
		super(id, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double toFindCashInBank() {
		// TODO Auto-generated method stub
		return cashCredits();
	}
	
	public double cashCredits() {
		return cashCredits;
	}

}
