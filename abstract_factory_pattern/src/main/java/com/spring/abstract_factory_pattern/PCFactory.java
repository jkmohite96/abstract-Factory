package com.spring.abstract_factory_pattern;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	private PCFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public Computer createComputer() {

		return new PC(ram, hdd, cpu);
	}
}
