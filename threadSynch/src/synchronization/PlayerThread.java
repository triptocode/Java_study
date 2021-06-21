package synchronization;

public class PlayerThread extends Thread {
	
 int genre;
 Music music;
 public PlayerThread( int inputGenre, Music inputMusic) 
	 { this.genre = inputGenre; this.music = inputMusic; }

	@Override
	public void run() {
		
		switch(genre) { 

		case 1: music.hiphop();
		break;
		
		case 2: music.ballad();
		break;
		
		case 3: music.jazz();
		break;
		
		}  // switch			
	} // run 
	
	
	
} 
