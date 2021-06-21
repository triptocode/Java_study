package extendsThread;

public class ShapeMain {
	
	public static void main(String[] args) {
		
		ShapeThread shapeThread1= new ShapeThread("¡Ú");
		ShapeThread shapeThread2= new ShapeThread("¡Ù");
		ShapeThread shapeThread3= new ShapeThread("¢¼");
		ShapeThread shapeThread4= new ShapeThread("¢»");
		ShapeThread shapeThread5= new ShapeThread("¢À");
		ShapeThread shapeThread6= new ShapeThread("¢¿");
		
		
		
		
		shapeThread1.start();
		shapeThread2.start();
		shapeThread3.start();
		shapeThread4.start();
		shapeThread5.start();
		shapeThread6.start();
		
		System.out.println(" Multi Thread in Main ! ");
		
	}

}
