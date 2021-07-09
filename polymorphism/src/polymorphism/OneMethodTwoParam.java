package polymorphism;


public class OneMethodTwoParam {
	
	public static void main(String[] args) {
		classA a = new classA();
		a.methodA(1);                              
		a.methodA("가");                          
		
	} // END main
} // 클래스 OneMethodTwoParam 종료 

	
class classA {
		public void methodA (int param) {      //methodA 라는 하나의 동일 메소드명, 
			System.out.println(param);         //  동일변수명 param에
		}                        
		public void methodA (String param) {   // int, String 타입만 다르게 하고 
			System.out.println(param);	       // 오버로딩하여 다양한 작동방법을 가지게 함. 
		}	
} // 클래스  classA 종료 
	
	
	

