package quiz;

public class MyRunnable implements Runnable{
	public void run()
	{
		new Thread(new MyRunnable()).start();  // 답3번: Runnable 인터페이스를 구현하고 start를 시켜줘야해서 
		                                       // Thread를 생성할때Runnable를 구현한 클래스를 인자로 넣고 start를 시켜줘야한다. 
    
	}
	
}
	