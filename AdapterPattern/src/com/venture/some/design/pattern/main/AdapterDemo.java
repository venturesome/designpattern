package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.impl.AudioPlayer;

public class AdapterDemo {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "Beyond the honor.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far a way.vlc");
		audioPlayer.play("avi", "mind me.avi");

	}

}
