import java.io.*;
import java.util.*;
import pkaccount.*;
//import pkaccount.sb.*;
//import pkbanking.pkinterface.*;
import pkcustomer.*;


class BankDemo
{
		public static void main(String[] args)
		{
				Customer cust = new Customer(101,"ABC","XYZ",201,10000);
				
				cust.transaction(1);
				cust.transaction(2);
				cust.transaction(3);
				
				
		}
}