package aboutStatic;

class C {
        public static String classVar = "classVar (= static variable )";  // 클래스 C1에 전역 스태틱 변수 classVar 생성 (선언)
        public String instanceVar = "instanceVar";  //클래스 C1에  전역 인스턴스 변수 instanceVar 생성 (선언)	    
        public static void classMethod()  {
        	System.out.println("classMethod: "+classVar);   }  // OK     static 클래스매소드는 static변수만 ok 
    //    	System.out.println("classMethod: "+instanceVar);}  // error
        public void instanceMethod() { 
        	System.out.println("instanceMethod: "+classVar);  // OK 인스턴스메소드에서는 static변수와 instance 변수모두 ok
        	System.out.println("instanceMethod: "+instanceVar); }   // OK 
        }

public class StaticApp {
	
		public static void main(String[] args) {
   System.out.println(C.classVar); // OK    다른클래스를 통해 그 내부 static=클래스 변수에 접근가능 
// System.out.println(C.instanceVar); // Error   다른클래스를 통해 그 내부 인스턴스변수 접근불가
	
   C.classMethod();       // OK 
// C.instanceMethod();    // Error
	
   C c1 = new C(); // instance c1: 클래스C안에 static변수와 static메서드와 연결되고 어느한쪽만 대입값 변경시에도 C와c1,c2 모두  영향을 주고받는다. 
   C c2 = new C(); // instance c1: 클래스C안에 인스턴스변수와 인스턴스메서드와 형식과 값 둘다 복사후 연결이 끊긴상태. 둘중 하나 변경시 서로 영향x 

   System.out.println(c1.classVar);
   System.out.println(c1.instanceVar);
   
   c1.classVar = "c1.classVar - new input: 인스턴스c1 값 변경시 연결된 다른클래스C와  인스턴스c2 대입값도 모두 변경된다.";
   System.out.println("C.classVar: "+ C.classVar);
   System.out.println("c2.classVar: "+ c2.classVar);
   
   c1.instanceVar = "in c1.instanceVar, new input : not linked to C and C2";
// System.out.println(C.instanceVar); // error
   System.out.println(c1.instanceVar);
   System.out.println("c2.instanceVar: "+c2.instanceVar); // / C의 인스턴스변수는 복사후 연결이 끊기고 c2값 미변경으로 처음 C의인스턴스값 출력
	        }
	}
