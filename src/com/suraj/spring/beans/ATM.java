package com.suraj.spring.beans;

public class ATM {

	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void printBalanceInfo(String accNum) {
		getPrinter().printBalanceInfo(accNum);
	}
}
