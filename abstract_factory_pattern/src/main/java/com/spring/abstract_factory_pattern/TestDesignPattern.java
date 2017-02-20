package com.spring.abstract_factory_pattern;

public class TestDesignPattern {
	
	public static void main(String[] args) {
		
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		
		Computer pc = ComputerFactory.getComputer("PC", "4GB", "500GB", "i3");
		
		
		Computer server  = ComputerFactory.getComputer("Server", "80GB", "1024TB", "i7");
		
		System.out.println("AbstractFactory PC config : "+pc);
		System.out.println("AbstractFactory Server config : "+server);
		
	}

}
