package com.kodewala.sb;

public class Driver {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Kodewala"); // StringBuilder Object ---> mutable --> scp + heap

		sb.append(" Academy"); //" Academy" --> scp

		System.out.println(sb);
	}

}
