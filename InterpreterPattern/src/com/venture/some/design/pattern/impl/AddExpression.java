package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Expression;

public class AddExpression implements Expression {

	private Expression exp1;
	private Expression exp2;
	
	public AddExpression(Expression exp1, Expression exp2) {
		super();
		this.exp1 = exp1;
		this.exp2 = exp2;
	}


	@Override
	public boolean interpret(String context) {
		
		return exp1.interpret(context)&&exp2.interpret(context);
	}

}
