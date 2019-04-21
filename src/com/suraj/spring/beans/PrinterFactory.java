package com.suraj.spring.beans;

public class PrinterFactory {

	private static final Printer PRINTER = new Printer();
	public static Printer getPrinter() {
		return PRINTER;
	}
}
