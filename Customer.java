package pkcustomer;


import java.util.*;
import pkaccount.sb.*;



public class Customer
{
	Scanner in = new Scanner(System.in);
		private int custId;
		private String name;
		private String address;
		private SBAccount account;
		
		public Customer()
		{		}
		
		public Customer(int custId, String name,String address,int accNo, double initBalance)
		{
			this.custId = custId;
			this.name = name;
			this.address = address;
			this.account = new SBAccount(accNo,initBalance);
		}
		
		public int transaction(int type)
		{
				if(type!=1 && type!=2 && type!=3)
				{
						return 0;
				}
			
				double amount;
				int res;
				
				switch(type)
				{
					case 1:
									System.out.print("Enter Amount to be Deposit: ");
									amount = Double.parseDouble(in.nextLine());
									res = account.deposit(amount);
									if(res==1)
									{
											System.out.println("Success....\n Current Balance: "+account.getBalance());
									}
									else
									{
											System.out.println("Failed....\n");
									}
									break;
									
					case 2:
									System.out.print("Enter Amount to be Withdraw: ");
									amount = Double.parseDouble(in.nextLine());
									res = account.withdraw(amount);
									if(res==1)
									{
											System.out.println("Success....\n Current Balance: "+account.getBalance());
									}
									else
									{
											System.out.println("Failed....\n");
									}
									break;
					
					case 3:
									amount = account.calcInterest();
									System.out.println("\nInterest Added: Rs."+amount);
									break;
					
					default:
									break;
					
				}
				return 1;
		}
	
}

