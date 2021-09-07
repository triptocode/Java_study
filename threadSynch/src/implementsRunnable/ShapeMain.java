package implementsRunnable;

import extendsThread.ShapeThread;

public class ShapeMain {
	
	public static void main(String[] args) {
		
		ShapeThread shapeThread1= new ShapeThread("★");
		ShapeThread shapeThread2= new ShapeThread("☆");
		ShapeThread shapeThread3= new ShapeThread("♠");
		ShapeThread shapeThread4= new ShapeThread("♤");
		ShapeThread shapeThread5= new ShapeThread("♣");
		ShapeThread shapeThread6= new ShapeThread("♧");
		
		
		Thread thread1= new Thread(shapeThread1);
		Thread thread2= new Thread(shapeThread2);
		Thread thread3= new Thread(shapeThread3);
		Thread thread4= new Thread(shapeThread4);
		Thread thread5= new Thread(shapeThread5);
		Thread thread6= new Thread(shapeThread6);
		
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		
		System.out.println(" Multi Thread in Main ! ");
		
	}

}
