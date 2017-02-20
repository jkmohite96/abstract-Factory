package com.spring.abstract_factory_pattern;

public abstract class Computer {

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	
	@Override
	public String toString() {
		return "Computer [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
