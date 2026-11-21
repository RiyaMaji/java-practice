package com.kodewala.oops.inheritance.mp.cw1;

public class MultifunctionPrinter {
	Printer printer;
	Scanner scanner;
	public MultifunctionPrinter() {
		super();
		this.printer = new Printer();
		this.scanner = new Scanner();
	}
	public void printScan() {
		printer.printDocument();
		scanner.scanDocument();
	}
}
