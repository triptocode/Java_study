package synchronization;

public class MusicMain {
	
	public static void main(String[] args) {
		
	Music musicObj = new Music();
		
	PlayerThread player1 = new PlayerThread(1, musicObj);  // °øÀ¯°´Ã¼  Music 
	PlayerThread player2 = new PlayerThread(1, musicObj);
	PlayerThread player3 = new PlayerThread(3, musicObj);
		
		player1.start();
		player2.start();
		player3.start();	
	}
}
