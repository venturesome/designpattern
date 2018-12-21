package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.AdvancedMediaPlayer;

public class Mp4Player extends AdvancedMediaPlayer{

	@Override
	public void play(String fileName) {
		
		super.say("Playing MP4 name:"+fileName);
	}
}
