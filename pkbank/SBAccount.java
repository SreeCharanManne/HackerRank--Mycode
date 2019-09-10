package pkaccount.sb;



import java.io.*;
import java.util.*;
import pkbanking.pkinterface.*;
import pkaccount.*;


public class SBAccount extends Account implements ITransaction, IInterestRate
{
		public int deposit(double depAmount)
		{
				if(depAmount<0)
				{
						return 0;
				}
				
				balance = balance + depAmount;
				return 1;
		}
		
		public int withdraw(double widAmount)
		{
				if(widAmount>(balance-minBalance))
				{
						return 0;
				}
				
				balance = balance - widAmount;
				return 1;
		}
		
		public double calcInterest()
		{
				double interest;
				interest = balance * sbrate;
				balance += interest;
				return interest;
		}
		
		
		public SBAccount()
		{}
		
		public SBAccount(int accNo, double initBalance)
		{
				super(accNo,initBalance);
		}
		
		public double getBalance()
		{
			return balance;
		}
		
		
}
