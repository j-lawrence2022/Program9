// Application: Program 9
// Name:        Justin Lawrence
// GitHub User: j-lawrence2022
// Date:        Nov 21, 2022
// Version:     1.0
// Description: Subclasses 

import java.util.Scanner;

public class BankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create scanner for keyboard input and create checking and saving account
		Scanner keyboard = new Scanner(System.in);
		Bankaccount checking = new Bankaccount();
		SavingsAccount savings = new SavingsAccount();
		double dep,wit,tr;
		
		//create initial balances for checking and savings
		checking.setbalance(100.00);
		savings.setbalance(200.00);
		savings.accountType ='S';
		System.out.println("Saving Account: " +savings.accountType);
		System.out.println("Checking Account: "+checking.accountType);
		
		//Add new item to the main method
		System.out.println("Add a name to the account");
		checking.name = keyboard.next();
		//create menu for account types
		int choice = 0;
		int accounttype = 0;
		System.out.println(checking.name + "'s Accounts");
		System.out.println("1. Checking ");
		System.out.println("2. Saving");
		System.out.println("3. Exit");
		accounttype = keyboard.nextInt();
		
		//if statement if choice is 1
		if (accounttype ==1)
		 {
	do
	{
		//create menu for checking account
	System.out.println("1.Check your balance");
	System.out.println("2. Deposit Cash");
	System.out.println("3. Withdraw Cash");
	System.out.println("4. transfer");
	System.out.println("5.Exit");
	System.out.println("Enter youre choice");
	choice = keyboard.nextInt();
	
	
	//if statements depending on the number from the menu chosen
	if(choice <1 || choice>6)
	{
		System.out.println("This choice is invalid please choose another.");
	} 
	
	if(choice ==1)
	{
		System.out.println("Your checking balance is currently " + checking.getbalance());	
	}
	
	if (choice ==2)
	{
		System.out.println("How much money would you like to deposit?");
		dep= keyboard.nextInt();
		checking.addDeposit(dep);
		System.out.println("Your balance is now " +checking.getbalance());
	}
	
	if(choice ==3)
	{
		System.out.println("Enter the amount you want to withdraw from your account");
		wit = keyboard.nextDouble();
		checking.subwithdraw(wit);
		System.out.println("Your balance is now " +checking.getbalance());
	}
	if(choice ==4)
	{
		System.out.println("enter the amount you want transfered ");
		tr = keyboard.nextInt();
		checking.transfer(tr);
		System.out.println("Your balance is now " +checking.getbalance());
	}
	
	if(choice == 5)
	{
		break;
	}
		
		
	} while (choice !=5);
		 }
		if (accounttype == 2)
		{
			do
			{
				//create menu for checking account 
			System.out.println("1. Check your balance");
			System.out.println("2. Deposit Cash");
			System.out.println("3. Withdraw Cash");
			System.out.println("4. transfer");
			System.out.println("5. Calculate Interest");
			System.out.println("6. Exit");
			System.out.println("Enter youre choice");
			choice = keyboard.nextInt();
			
			//if statements for choices from menu
			if(choice <1 || choice>6)
			{
				System.out.println("This choice is invalid please choose another.");
			} 
			
			if(choice ==1)
			{
				System.out.println("Your checking balance is currently " + savings.getbalance());	
			}
			
			if (choice ==2)
			{
				System.out.println("How much money would you like to deposit?");
				dep= keyboard.nextInt();
				if(accounttype == 1)
				{
				checking.addDeposit(dep);} else
				{
					savings.addDeposit(dep);
				}
				System.out.println("Your balance is now " +savings.getbalance());
			}
			
			if(choice ==3)
			{
				System.out.println("Enter the amount you want to withdraw from your account");
				wit = keyboard.nextDouble();
				checking.subwithdraw(wit);
				System.out.println("Your balance is now " +savings.getbalance());
			}
			if(choice ==4)
			{
				System.out.println("enter the amount you want transfered ");
				tr = keyboard.nextInt();
				checking.transfer(tr);
				System.out.println("Your balance is now " +savings.getbalance());
			}
			
			if(choice == 5)
			{
			double balance = savings.balance;
			double interest = savings.interestRate;
			interest = savings.interestCalc(balance, interest);	
			System.out.println("The interest of your current balance is: " +interest);	
			
		}
			if(choice == 6)
			{
				break;
			}
			} while (choice!=6);
			
			
			
			
			 }
		 
		 }

	}

