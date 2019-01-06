package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.DispenserState;
import com.venture.some.design.pattern.impl.EmptyState;
import com.venture.some.design.pattern.impl.FullState;

public class WaterDispenser {

	private int capacity =10;
	private DispenserState dispenserState;
	
	public WaterDispenser() {
		super();
		this.dispenserState = new FullState();
	}

	public DispenserState getDispenserState() {
		return dispenserState;
	}

	public void setDispenserState(DispenserState dispenserState) {
		this.dispenserState = dispenserState;
	}
	
	public void press() {
	
		capacity--;
		if(capacity==0) {
			this.setDispenserState(new EmptyState());
		}else if(capacity<0) {
			reset();
		}
		
		dispenserState.press();
	}
	
	public void reset() {
		capacity=10;
		this.setDispenserState(new FullState());
		
		System.out.println("The water is reset!");
	}
}
