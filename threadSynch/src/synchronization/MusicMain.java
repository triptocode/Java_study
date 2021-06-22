package synchronization;

public class MusicMain {
	
	public static void main(String[] args) {
		
	Music musicObj = new Music();                         // °øÀ¯°´Ã¼  Music musicObj
		
	PlayerThread player1 = new PlayerThread(1, musicObj);  
	PlayerThread player2 = new PlayerThread(1, musicObj);
	PlayerThread player3 = new PlayerThread(3, musicObj);
		
		player1.start();
		player2.start();
		player3.start();	
	}
}
