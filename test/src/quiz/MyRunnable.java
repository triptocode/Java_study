package quiz;

public class MyRunnable implements Runnable{
	public void run()
	{
		new Thread(new MyRunnable()).start();  // ��3��: Runnable �������̽��� �����ϰ� start�� ��������ؼ� 
		                                       // Thread�� �����Ҷ�Runnable�� ������ Ŭ������ ���ڷ� �ְ� start�� ��������Ѵ�. 
    
	}
	
}
	