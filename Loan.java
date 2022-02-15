import java.lang.Math;


public class Loan {
	
	private double annualInterestRate = 2.5;
	private int numberOfYear = 1 ;
	private double loanAmount = 1000;
	private java.util.Date loanDate = new java.util.Date();    

	
	public Loan(){}
	
	public Loan(double annualInterestRate, int numberOfYear, double loanAmount) 
	{
		this.annualInterestRate = annualInterestRate;
		this.numberOfYear = numberOfYear;
		this.loanAmount = loanAmount;
	}
	
	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}

	public int getNumberOfYear() 
	{
		return numberOfYear;
	}
	
	public double getLoanAmount() 
	{
		return loanAmount;
	}
	
	public java.util.Date getLoanDate() 
	{
		return loanDate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public void setNumberOfYear(int numberOfYear) 
	{
		this.numberOfYear = numberOfYear;
	}
	
	public void setLoanAmount(double loanAmount) 
	{
		this.loanAmount = loanAmount;
	}

	public double getMonthlyPayment()
	{
		double result = (this.loanAmount * (this.annualInterestRate / 12 /100) ) /  (1 - (1 /(Math.pow(1 + (this.annualInterestRate / 12/100), (this.numberOfYear* 12)))) );	
		return result;
	}
	
	public double getTotalPayment()
	{
		double result = getMonthlyPayment() * this.numberOfYear * 12; 
		return result;
	}
	
	
	
	
	


}
