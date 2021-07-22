package assignment.second.java.third_Question.BankAccount;

public class SavingsAccountHolder extends BankAccountHolder {
		double fixedDeposits = 50000;

	public SavingsAccountHolder(int id, String name, double balance) {
		super(id, name, balance);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public double toFindCashInBank() {
		// TODO Auto-generated method stub
		return fixedDeposits();
	}
	
	public double fixedDeposits() {
		return fixedDeposits;
	}

}
