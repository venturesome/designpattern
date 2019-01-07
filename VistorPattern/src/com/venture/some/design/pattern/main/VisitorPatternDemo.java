package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.ComputerPart;
import com.venture.some.design.pattern.impl.Computer;
import com.venture.some.design.pattern.impl.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {

	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
