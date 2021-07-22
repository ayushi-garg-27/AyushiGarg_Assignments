package assignment.second.java.third_Question.BankAccount;

public class MainBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fixedDeposits = 50000;
		double cashCredits = 20000;
		
		
		SavingsAccountHolder s = new SavingsAccountHolder(1,"Riya",3000);
		CurrentAccountHolder c = new CurrentAccountHolder(2,"Ram",2000);
		
		double Total=s.toFindCashInBank()+s.balance+c.balance+c.toFindCashInBank();
		
		System.out.println("Bank has Total Cash Rs:" + Total);
		
	}
	
	

}
