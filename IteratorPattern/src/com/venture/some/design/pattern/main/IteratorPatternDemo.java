package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.Container;
import com.venture.some.design.pattern.Iterator;
import com.venture.some.design.pattern.impl.NameRepository;

public class IteratorPatternDemo {
	
	public static void main(String[] args) {
		
		Container names = new NameRepository();
		/*Iterator iterator = names.getIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		for(Iterator iterator = names.getIterator();iterator.hasNext();) {
			System.out.println(iterator.next());			
		}
	}
}
