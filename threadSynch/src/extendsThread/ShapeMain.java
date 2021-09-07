package extendsThread;

public class ShapeMain {
	
	public static void main(String[] args) {
		
		ShapeThread shapeThread1= new ShapeThread("★");
		ShapeThread shapeThread2= new ShapeThread("☆");
		ShapeThread shapeThread3= new ShapeThread("♠");
		ShapeThread shapeThread4= new ShapeThread("♤");
		ShapeThread shapeThread5= new ShapeThread("♣");
		ShapeThread shapeThread6= new ShapeThread("♧");
		
		
		
		
		shapeThread1.start();
		shapeThread2.start();
		shapeThread3.start();
		shapeThread4.start();
		shapeThread5.start();
		shapeThread6.start();
		
		System.out.println(" Multi Thread in Main ! ");
		
	}

}
