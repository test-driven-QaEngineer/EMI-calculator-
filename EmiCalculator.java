package day3;

import java.util.Scanner;

public class EmiCalculator {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Loan amount in dollars");
		double principal =scanner.nextDouble();
		System.out.println("Enter the annual interest rate");
		double annualRate =scanner.nextDouble();
		double monthlyRate= annualRate / (12*100);
		System.out.println("Enter Loan term in months");
		int numberOfPayments = scanner.nextInt();
		double emi = principal * monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)
        / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
		System.out.println("Your EMI is " + emi);
	}

}
