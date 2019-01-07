package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.ComputerPart;
import com.venture.some.design.pattern.ComputerPartVisitor;

public class Monitor implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
