package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.Expression;
import com.venture.some.design.pattern.impl.AddExpression;
import com.venture.some.design.pattern.impl.OrExpression;
import com.venture.some.design.pattern.impl.TerminalExpression;

public class InterpreterPatternDemo {

	// 规则：Robert 和 John 是男性
	private static Expression maleExpression() {

		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");

		return new OrExpression(robert, john);
	}

	// 规则：Julie 是一个已婚的女性
	private static Expression marriedWomenExpression() {

		Expression married = new TerminalExpression("Married");
		Expression women = new TerminalExpression("Women");

		return new AddExpression(married, women);
	}

	public static void main(String[] args) {

		Expression isMale = maleExpression();
		Expression isMarriedWoman = marriedWomenExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	}
}
