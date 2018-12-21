package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.AdvancedMediaPlayer;

public class VlcPlayer extends AdvancedMediaPlayer {

	@Override
	public void play(String fileName) {
		
		super.say("Playing Vlc name:"+fileName);
	}

	
}
