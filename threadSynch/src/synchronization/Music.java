package synchronization;

public class Music {
	
 public synchronized void hiphop (){
 	 for(int n=0; n<5; n++) {System.out.println(" hiphop 5�� ������� ");         //synchronized void �� ��ü���� 
	     try { Thread.sleep((int)(Math.random()*1000+0)); } 
	     catch (InterruptedException e) { e.printStackTrace();}
     }   // for end 	 
 } // hiphop end	 
	

 public void ballad (){
	 for(int n=0; n<4; n++) synchronized(this) {System.out.println(" ballad 4�� �������");   //synchronized(this) �� ��¹����� ���� 
	     try { Thread.sleep((int)(Math.random()*3000+2)); } 
	     catch (InterruptedException e) { e.printStackTrace();}
         } // for end 
 } // ballad end 	
 
 public void jazz (){
 	 for(int n=0; n<4; n++) {System.out.println(" (��� �����) jazz ~ �ݢ�~�� �ۢݢ� ");            // synchronized �������� �ʰ� ������ synch ������ ������ �߰��߰����� ��µǰ� Ǯ��д�. 
    	 try { Thread.sleep((int)(Math.random()*2000+1)); } 
	     catch (InterruptedException e) { e.printStackTrace();}
     } // for end 
 } // jazz end 	
 
		
} // Music class end 
