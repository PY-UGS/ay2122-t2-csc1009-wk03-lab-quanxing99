import java.util.Scanner;

public class LoanApplication {
	
	public static void main(String[] args) 
	{
		//Declare a new loan application
		Loan loan001 = new Loan(); 
		
		// Take Annual Interest Rate from user
		Scanner interestInput = new Scanner(System.in);
		System.out.println("Enter annual interest rate, for example, 8.25:");
		double interestRate = interestInput.nextDouble(); 
		
		// Take Number of year from user 
		Scanner yearInput = new Scanner(System.in);
		System.out.println("Enter number of year as an Integer:");
		int numberOfYear = yearInput.nextInt(); 

		
		// Take Loan Amount from user
		Scanner amountInput = new Scanner(System.in);
		System.out.println("Enter loan amount, for example, 120000.95:");
		double loanAmount = amountInput.nextDouble();

		// Set properties for new loan application
		loan001.setAnnualInterestRate(interestRate);
		loan001.setNumberOfYear(numberOfYear);
		loan001.setLoanAmount(loanAmount); 
		
		// Close scanner to prevent resource leak
		interestInput.close();
		amountInput.close();
		yearInput.close();

		System.out.println(String.format("The loan was created on " + loan001.getLoanDate()));

		System.out.println(String.format("The monthly payment is %.2f", loan001.getMonthlyPayment()));
		
		System.out.println(String.format("The total payment is %.2f", loan001.getTotalPayment()));


		


		
		
		
		
		
		
	}

}
