/*
Bank Transactions
Positive value refers Credit and Negative refers Debit Transaction

Transactions Amount
1 50000
2 -2000
3 3000
4 -15000
5 -200
6 -300
7 4000
8 -3000

First Store all the transactions in any data structure of Your Choice from collections, and by using
Loops and conditional statements
1. Print total number of credit and debit transactions completed
2. Print the total amount credited and debited in account
3. Print total amount remaining at the end in Bank Account
4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
Transaction with Amount” and also print total number of suspicious transactions
 */

import java.util.ArrayList;
import java.util.List;

public class Assignment8_ConditionalStatementsAndLoops 
{
	public static void main(String[] args) 
	{
		int TransactionCounter=0;
		int Credit=0;
		int Debit=0;
		int AcBalance=0;
		int CredCount=0;
		int DebitCount=0;
		int SuspiciousCount=0;
		
		List<Integer> Transactions = new ArrayList<>();
		Transactions.add(50000);
		Transactions.add(-2000);
		Transactions.add(3000);
		Transactions.add(-15000);
		Transactions.add(-200);
		Transactions.add(-300);
		Transactions.add(4000);
		Transactions.add(-3000);
		
		
		for(int Amount : Transactions)
		{
			AcBalance=AcBalance+Amount;
			TransactionCounter=TransactionCounter+1;
			if(Amount >0)
			{
				Credit=Credit+Amount;
				CredCount=CredCount+1;
			
			}
			else
			{
				Debit=Debit+Amount;
				DebitCount=DebitCount+1;
			}
			if(Amount>10000 || Amount <-10000)
			{
				SuspiciousCount=SuspiciousCount+1;
				System.out.println("Suspicious credit/debit Transaction with Amount: " + Amount);
			}
		}
		System.out.println("------ Transaction Summary ------");
		System.out.println("Total number of Transactions: " + TransactionCounter);
		System.out.println("Total number of Credits: " + CredCount);
		System.out.println("Total number of Debits: " + DebitCount);
		System.out.println("Total Amount credited: " + Credit);
		System.out.println("Total Amount debited: " + Debit);
		System.out.println("Account Balance: " + AcBalance);
		System.out.println("Total number of Suspicious credit/debit Transaction: " + SuspiciousCount);
	}
}
