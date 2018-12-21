package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.adapter.MediaAdapter;

public class AudioPlayer extends MediaAdapter {

	@Override
	public void play(String fileName) {
		
		System.out.println("Playing audio name:"+fileName);
	}
	
	public void play(String type, String fileName) {

		if("mp3".equalsIgnoreCase(type)) {
			this.play(fileName);
		}else if("vlc".equalsIgnoreCase(type) || "mp4".equalsIgnoreCase(type)){
			(new MediaAdapter()).play(type, fileName);	
		}else {
			System.out.println("invalid medie:"+type);
		}	
	}

}
