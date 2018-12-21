package com.venture.some.design.pattern.adapter;

import com.venture.some.design.pattern.AdvancedMediaPlayer;
import com.venture.some.design.pattern.MediaPlayer;
import com.venture.some.design.pattern.impl.Mp4Player;
import com.venture.some.design.pattern.impl.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	@Override
	public void play(String fileName) {
		advancedMediaPlayer.play(fileName);
	}

	public void play(String type, String fileName) {
		
		if("vlc".equalsIgnoreCase(type)) {
			advancedMediaPlayer = new VlcPlayer();
		}else if("mp4".equalsIgnoreCase(type)) {
			advancedMediaPlayer = new Mp4Player();
		}    
		play(fileName);
	}	
}
