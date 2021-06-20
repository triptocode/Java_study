package basic;

public class MethodMain {
		
		public static void main ( String[] args) {
		MethodReturn method = new MethodReturn();
		method.method1();
		method.method2(2);
		method.method3();
		method.method4(1, 5);
		
    //  리턴값받을변수 =    객체.메소드명(입력인수)
		int value = method.method5(5);
		System.out.println(" , 리턴값: "+value);          	
		
		
		
		// method.say_nick("pool");
	    //method.say_nick("pool");
		 
  String value2 =method.method6("pool");
  System.out.println
  ("리턴결과 (foolish+1 또는 pool+2): "+value2);
		
		}
	}
	

