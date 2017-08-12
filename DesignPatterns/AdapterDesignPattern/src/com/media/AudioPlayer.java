package com.media;

public class AudioPlayer implements MediaPlayer{
	
	
	public void play(String audioType, String fileName){
		
		if(audioType.equalsIgnoreCase("mp3")) {
			 System.out.println("Playing mp3 file. Name: " + fileName);	
		} else {
			MediaAdapter adapter = new MediaAdapter(audioType);
			adapter.play(audioType, fileName);
		}
	}
}
