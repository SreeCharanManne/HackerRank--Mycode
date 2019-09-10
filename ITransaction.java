package pkbanking.pkinterface;

public interface ITransaction
{
		double minBalance=500;
		
		public int withdraw(double amount);
		public int deposit(double amount);
}

