package extendsThread;

public class ShapeThread extends Thread {

	String shape;
	
	public ShapeThread(String inputShape) { this.shape = inputShape; }
	
	
	
	
	@Override
public void run() {
		
	for (int i = 0; i<3; i++) 
	  { System.out.println(shape); 
		
	    try { Thread.sleep( (int) (Math.random()*2000+1) ); }     // Math.random() * 최대값 : 0.0 =< number <1.0 사이 숫자를 랜덤으로 생성,  (int)를 붙여 소수를 정수로 캐스팅
		catch (InterruptedException e) { e.printStackTrace(); }   // Math.radom은 0부터 랜덤생성되기에 1부터 뽑고싶으면 +1을 써준다. 
		  
	   }
		
} // run 종료 
	
	
}
