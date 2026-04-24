package BLC;

import Interface.SBI;
import UserDefineException.InsufficientBalance;
import UserDefineException.InvalidAmount;

public class BankOperation implements SBI{
        private CreateAccount ca;
        public BankOperation(CreateAccount ca) {
    	   this.ca=ca;
       }
	   @Override
	   public void deposite(double amount) {
		if(amount<=0) {
			try {
				throw new InvalidAmount("Amount is negative or zero");
			}catch(Exception e) {
				e.getMessage();
			}
		 }
		else {
			ca.setBalance(ca.getBalance()+amount);
			System .out.println("sucessfully amount deposited");
			System.out.println("GO tp checkBalance Menu to check your balance");
		}
	   }
	   @Override
	   public void withdrawl(double amount) {
		 if(amount<=0) {
			 try {
					throw new InvalidAmount("Amount is negative or zero");
				}catch(Exception e) {
					e.getMessage();
				}
		  }
		 else {
			 if(amount>ca.getBalance()) {
				 try {
				    throw new InsufficientBalance("you dont have enoungh money");
				 }catch(Exception e) {
					 e.getMessage();
					 }
				 }
				 
			 else{
			    	 ca.setBalance(ca.getBalance()-amount);
			     }
		 }
	   }
	   @Override
	   public double checkBalance() {
		 return ca.getBalance();
		
	   }
	   @Override
	   public void accountDetails() {
		   System.out.println("Name : "+ca.getName());
		   System.out.println("Account No : "+ca.getAccountNo());
		   System.out.println("Phone No : "+ca.getPhno());
		   System.out.println("Adhar No : "+ca.getAdharno());
		
	   }
       
}
