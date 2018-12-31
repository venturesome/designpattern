package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.Image;
import com.venture.some.design.pattern.impl.ProxyImage;

public class ProxyPatternDemo {

	public static void main(String[] args) {

		Image image = new ProxyImage("test.image");
		image.display();
	}

}
