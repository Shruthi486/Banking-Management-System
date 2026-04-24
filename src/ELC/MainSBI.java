package ELC;


import java.util.Random;
import java.util.Scanner;

import BLC.BankOperation;
import BLC.CreateAccount;

public class MainSBI {
	public static void main(String[] args) {
		 System.out.println("\t\tSBI Bank");
		 System.out.println("Create Account Then We Can Proceed");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Your name");
		 String name=sc.nextLine();
		 System.out.println("Enter your phone no");
		 long phno=sc.nextLong();
		 System.out.println("Enter your adhar no");
		 long adharNo=sc.nextLong();
		 
		 Random rand = new Random();
		 
		 int min = 1000000;
		 int max = 9999999;
		 
		 int accountNo = rand.nextInt(max-min+1)+min;
		 CreateAccount ca=new CreateAccount(name,accountNo,phno,adharNo);
		 System.out.println();
		 System.out.println();
		 System.out.println("Account Created Successfully Mr."+ca.getName());
		 while(true){
			 System.out.println("\t1.Withdrawl");
			 System.out.println("\t2.Deposite");
			 System.out.println("\t3.CheckBalance");
             System.out.println("\t4.AccountDetails");
             System.out.println("\t5.Exit");
             System.out.println();

    		 System.out.println("Enter your Choice");
    		 int choice=sc.nextInt();
    		 BankOperation bp=new BankOperation(ca);
    		 switch(choice) {
    		 case 1:
    			 System.out.println("Enter the amount to withdrawl");
    			 double amount=sc.nextDouble();
    			 bp.withdrawl(amount);
    			 break;
    		 case 2:
    			 System.out.println("Enter the amount to Deposite");
    			 double amount2=sc.nextDouble();
    			 bp.deposite(amount2);
    			 break;
    		 case 3:
    			 System.out.println(bp.checkBalance());
    			 break;
    		 case 4:
    			 bp.accountDetails();
    			 break;
    		 case 5:
    			 System.out.println("Thanks You Visit Again...");
    			 System.exit(0);
    			 break;
    	     default:System.out.println("Invalid choice");
    		 
    		 }



		 }
	}
	

}
