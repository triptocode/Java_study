package basic;

public class MethodMain {
		
		public static void main ( String[] args) {
		MethodReturn method = new MethodReturn();
		method.method1();
		method.method2(2);
		method.method3();
		method.method4(1, 5);
		
    //  ���ϰ��������� =    ��ü.�޼ҵ��(�Է��μ�)
		int value = method.method5(5);
		System.out.println(" , ���ϰ�: "+value);          	
		
		
		
		// method.say_nick("pool");
	    //method.say_nick("pool");
		 
  String value2 =method.method6("pool");
  System.out.println
  ("���ϰ�� (foolish+1 �Ǵ� pool+2): "+value2);
		
		}
	}
	

