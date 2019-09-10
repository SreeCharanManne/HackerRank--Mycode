package pkaccount;

public abstract class Account
{
		protected int accNo;
		protected double balance;
		
		public Account()
		{}
		
		public Account(int accNo,double balance)
		{
			this.accNo = accNo;
			this.balance = balance;
		}
}
