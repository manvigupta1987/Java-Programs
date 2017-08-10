package com.media;

public class MediaAdapter implements MediaPlayer{
	AdvanceMediaPlayer mediaPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			mediaPlayer = new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")) {
			mediaPlayer = new MP4();
		}
	}
	
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("vlc")) {
			mediaPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")) {
			mediaPlayer.playMp4(fileName);
		}		
	}
}
