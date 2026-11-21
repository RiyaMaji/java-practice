package com.kodewala.inf.p12;

public interface ISecuritySystem {
	public default void start() {
		System.out.println("SecuritySystem.start()");
	}
}
