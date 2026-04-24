package BLC;

public class CreateAccount {
      private String name;
      private int accountNo;
      private double balance=500;
      private long phno;
      private long adharno;
	  public CreateAccount(String name, int accountNo, long phno, long adharno) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.phno = phno;
		this.adharno = adharno;
	  }
	  public String getName() {
		  return name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  public int getAccountNo() {
		  return accountNo;
	  }
	  public void setAccountNo(int accountNo) {
		  this.accountNo = accountNo;
	  }
	  public double getBalance() {
		  return balance;
	  }
	  public void setBalance(double balance) {
		  this.balance = balance;
	  }
	  public long getPhno() {
		  return phno;
	  }
	  public void setPhno(long phno) {
		  this.phno = phno;
	  }
	  public long getAdharno() {
		  return adharno;
	  }
	  public void setAdharno(long adharno) {
		  this.adharno = adharno;
	  }
      
      
      
}
