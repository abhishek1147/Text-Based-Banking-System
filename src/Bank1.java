import java.util.Scanner;
public class Bank1 {
	
	public static void main(final String[] args) {
		final Scanner in = new Scanner(System.in);
		int userInput;
		int size = 0;
		final double[] accBal = new double[250];
		final String[] accNames = new String[250];
		for (; true;) {
			System.out.println("Bank Admin Menu:");
			System.out.println("Please enter a menu option:");
			System.out.println("(1): Add customer to the bank");
			System.out.println("(2): Change customer name");
			System.out.println("(3): Check account balance");
			System.out.println("(4): Modify account balance");
			System.out.println("(5): Bank summary");
			System.out.println("(-1): Quit");

			userInput = in.nextInt();
			if (userInput == 1) {
				System.out.println("Bank Add customer Menu:");
				System.out.println("Please enter the account balance");
				final double bal = in.nextDouble();
				accBal[size] = bal;
				System.out.println("Please enter the account name");
				in.nextLine();
				final String name = in.nextLine();
				accNames[size] = name;
				System.out.println("Customer ID is: " + size);
				size++;
			} else if (userInput == 2) {
				System.out.println("Bank change name menu");
				System.out.println("Please enter the customr ID to change their name");
				final int i = in.nextInt();
				System.out.println("Enter the new name:");
				in.nextLine();
				accNames[i] = in.nextLine();
			} else if (userInput == 3) {
				System.out.println("Bank check balance menu");
				System.out.println("Please enter the customr ID to check balance");
				final int i = in.nextInt();
				System.out.println("Balance: " + accBal[i] + " $");
			} else if (userInput == 4) {
				System.out.println("Bank modify balance menu");
				System.out.println("Please enter the customr ID to modify balance");
				final int i = in.nextInt();
			System.out.println("Please enter the new balance: ");
			accBal[i]=in.nextDouble();
		}
		else if(userInput == 5) {
			System.out.println("Bank All Customer Summary Menu:");
			double total=0;
			for(int i=0;i<size;i++) {
				total=total+accBal[i];
				System.out.println("Account Holder Name: "+accNames[i]);
				System.out.println("Balance: "+accBal[i]+" $");
			}
			System.out.println("Total Balance in the Bank: "+total+" $");
		}
		else if(userInput == -1) {
			System.exit(-1);
		}
		else  {
			System.out.println("ERROR: Invalid Input");
		}
	}
}
}
