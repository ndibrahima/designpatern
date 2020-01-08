package adapter;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");

		MediaPlayer player = new MediaAdapter("mp4");
		player.play("mp4", "test.mp4");

		MediaPlayer player1 = new AudioPlayer();
		player1.play("mp4", "test1.mp4");
	}
}
