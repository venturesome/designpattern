package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Image;

public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;
	
	@Override
	public void display() {

		if(null==realImage) {
			realImage = new RealImage(this.fileName);
		}
		
		realImage.display();
	}

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

}
