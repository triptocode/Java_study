package extendsThread;

public class ShapeThread extends Thread {

	String shape;
	
	public ShapeThread(String inputShape) { this.shape = inputShape; }
	
	
	
	
	@Override
public void run() {
		
	for (int i = 0; i<3; i++) 
	  { System.out.println(shape); 
		
	    try { Thread.sleep( (int) (Math.random()*2000+1) ); }     // Math.random() * �ִ밪 : 0.0 =< number <1.0 ���� ���ڸ� �������� ����,  (int)�� �ٿ� �Ҽ��� ������ ĳ����
		catch (InterruptedException e) { e.printStackTrace(); }   // Math.radom�� 0���� ���������Ǳ⿡ 1���� �̰������ +1�� ���ش�. 
		  
	   }
		
} // run ���� 
	
	
}
