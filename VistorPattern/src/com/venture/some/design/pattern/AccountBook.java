package com.venture.some.design.pattern;

import com.venture.some.design.pattern.impl.ConsumeBill;
import com.venture.some.design.pattern.impl.IncomeBill;

public interface AccountBook {

	void visit(ConsumeBill bill);
	void visit(IncomeBill bill);
}
