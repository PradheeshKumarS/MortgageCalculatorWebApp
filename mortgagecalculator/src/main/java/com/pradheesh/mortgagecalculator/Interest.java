package com.pradheesh.mortgagecalculator;

import java.text.NumberFormat;


public class Interest {
	
	private double principalAmount;
	private double interestRate;
	private int termInYears;
	
	public double getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public int getTermInYears() {
		return termInYears;
	}
	public void setTermInYears(int termInYears) {
		this.termInYears = termInYears;
	}
	
	public String calculateInterest() {
		double monthlyInterestRate = this.interestRate / 12;
		int noOfPayments = this.termInYears * 12;
		
		double currency = this.principalAmount * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, noOfPayments))) / ((Math.pow(1 + monthlyInterestRate, noOfPayments) - 1));
		return NumberFormat.getInstance().format(currency);
	}
	
	

}
