package com.venture.some.design.pattern;

import com.venture.some.design.pattern.impl.Computer;
import com.venture.some.design.pattern.impl.Keyboard;
import com.venture.some.design.pattern.impl.Monitor;
import com.venture.some.design.pattern.impl.Mouse;

public interface ComputerPartVisitor {

	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}
