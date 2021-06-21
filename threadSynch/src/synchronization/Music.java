package synchronization;

public class Music {
	
 public synchronized void hiphop (){
 	 for(int n=0; n<5; n++) {System.out.println(" hiphop 5번 연속출력 ");         //synchronized void 로 전체설정 
	     try { Thread.sleep((int)(Math.random()*1000+0)); } 
	     catch (InterruptedException e) { e.printStackTrace();}
     }   // for end 	 
 } // hiphop end	 
	

 public void ballad (){
	 for(int n=0; n<4; n++) synchronized(this) {System.out.println(" ballad 4번 연속출력");   //synchronized(this) 로 출력문에만 설정 
	     try { Thread.sleep((int)(Math.random()*3000+2)); } 
	     catch (InterruptedException e) { e.printStackTrace();}
         } // for end 
 } // ballad end 	
 
 public void jazz (){
 	 for(int n=0; n<4; n++) {System.out.println(" (잠시 듣고가는) jazz ~ ♬♩~♪ ♩♬♩ ");            // synchronized 설정하지 않고 안전한 synch 설정된 데이터 중간중간에도 출력되게 풀어둔다. 
    	 try { Thread.sleep((int)(Math.random()*2000+1)); } 
	     catch (InterruptedException e) { e.printStackTrace();}
     } // for end 
 } // jazz end 	
 
		
} // Music class end 
