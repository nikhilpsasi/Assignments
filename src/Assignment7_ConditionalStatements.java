/*
A bank evaluates loan applicants based on the following criteria:
1. Credit Score:
* If the credit score is above 750, the loan is automatically approved.
* If the credit score is between 650 and 750, additional checks are performed.
* If the credit score is below 650, the loan is denied.
2. Income:
* For credit scores between 650 and 750, the customer’s income must be at least $50,000
  for the loan to be considered.

3. Employment Status:
* If the customer’s income is at least 50,000, the system checks whether the customer is
  employed.
* If the customer is unemployed, the loan is denied.
4. Debt-to-Income Ratio:
* If the customer is employed, the system checks the debt-to-income (DTI) ratio.
* If the DTI ratio is less than 40%, the loan is approved.
* If the DTI ratio is 40% or greater, the loan is denied.

Now based on below details, print whether user is eligible to get the loan or not
customerName = "John Doe";
creditScore = 720;
income = 55000.0;
isEmployed = true;
debtToIncomeRatio = 35.0;
 */

public class Assignment7_ConditionalStatements 
{

	public static void main(String[] args)
		{
			String customerName = "John Doe";
			int creditScore = 720;
			double income = 55000.0;
			boolean isEmployed = true;
			double debtToIncomeRatio = 35.0;
			
			if(creditScore>750)
			{
				System.out.println("Loan Approved for "+customerName);
			}
			
			else if(creditScore>650 && creditScore<750)
				{
					if(income>=50000)
					{
						if(isEmployed==true)
						{
							if(debtToIncomeRatio<40)
							{
								System.out.println("Loan Approved for "+customerName);
							}
							else
							{
								System.out.println("Loan Denied due to high DTI ratio");
							}
						}
						else
						{
							System.out.println("Loan Denied due to un employment");
						}
						}
					else
					{
						System.out.println("Loan Denied due to low income");
					}
					}
			else
			{
				System.out.println("Loan Denied due low credit score");
			}
		}
	}
