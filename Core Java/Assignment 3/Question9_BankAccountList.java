package assignment3.java;

import java.util.TreeSet;

class SavingAccount implements Comparable{
	double acc_balance;
	double acc_ID;
	String accountHoldername;
	String isSalaryAccount;
	
	public SavingAccount(double acc_balance, double acc_ID, String accountHoldername, String isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}
	
	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHoldername="
				+ accountHoldername + ", isSalaryAccount=" + isSalaryAccount + ", getAcc_balance()=" + getAcc_balance()
				+ ", getAcc_ID()=" + getAcc_ID() + ", getAccountHoldername()=" + getAccountHoldername()
				+ ", getIsSalaryAccount()=" + getIsSalaryAccount() + "\n]";
		
		/*return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHoldername="
		+ accountHoldername + ", isSalaryAccount=" + isSalaryAccount + ", getAcc_balance()=" + getAcc_balance()
		+ ", getAcc_ID()=" + getAcc_ID() + ", getAccountHoldername()=" + getAccountHoldername()
		+ ", getIsSalaryAccount()=" + getIsSalaryAccount() + ", getClass()=" + getClass() + ", hashCode()="
		+ hashCode() + ", toString()=" + super.toString() + "\n]";*/
	}
	
	
	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public double getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(double acc_ID) {
		this.acc_ID = acc_ID;
	}

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}

	public String getIsSalaryAccount() {
		return isSalaryAccount;
	}

	public void setIsSalaryAccount(String isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	
	public void Widthdraw(double w) {
		this.acc_balance -=w;
		System.out.println(w);
	}
	
	
	
	
	public void Deposit(double d) {
		this.acc_balance +=d;
		System.out.println(d);
		
		
	}
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		double id1 = this.acc_ID;
		SavingAccount c = (SavingAccount)o;
		double id2 = c.acc_ID;
		if(id1<id2) {
			return -1;
		}
		else if(id1>id2) {
			return 1;	
		}else {
			return 0;
		}
	}
	
}

public class Question9_BankAccountList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount s1 = new SavingAccount(11000,5,"Priya","No");
		SavingAccount s2 = new SavingAccount(21000,21,"Divya","Yes");
		SavingAccount s3 = new SavingAccount(10000,1,"Part","No");
		SavingAccount s4 = new SavingAccount(51000,11,"Rohit","Yes");
		
		TreeSet t = new TreeSet();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		
		System.out.println(t);
		
		s1.Widthdraw(100);
		s2.Widthdraw(400);
		s3.Widthdraw(700);
		s4.Widthdraw(200);
		s1.Deposit(500);
		s2.Deposit(600);
		s3.Deposit(800);
		s4.Deposit(900);
		
		System.out.println(t);
		

	}

}
