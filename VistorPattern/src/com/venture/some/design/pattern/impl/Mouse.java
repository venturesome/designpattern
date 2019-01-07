package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.ComputerPart;
import com.venture.some.design.pattern.ComputerPartVisitor;

public class Mouse implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
