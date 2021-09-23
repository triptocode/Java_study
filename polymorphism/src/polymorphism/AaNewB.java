package polymorphism;

public class AaNewB {

	public static void main(String[] args) {
		
// 1. 클래스B를  타입클래스 A 형변환!하여 타입A로 제한된 B 실행!! 	
// 2. 클래스B를 타입클래스 B 그대로 사용할때 차이점을 아래와 같이 비교 	
		
	A b1 = new B(); // 클래스B를 클래스A타입으로 형변환!!! 타입A로 제한된 멤버로만 상속받은B클래스가 실행!! 
		b1.methodA();  
	//	b1.methodB(); 
	
	//	아래처럼 타입클래스B로 new B를 생성하면, A를 상속기능을 넣은 B타입이 작동되어 클래스 A와 B에 있는 모든 기능을 사용가능해진다. 	
		
	B b2 = new B(); 
		b2.methodA();
		b2.methodB(); 		
		System.out.println(b2.methodA());
		System.out.println(b2.methodB());	

// 1. 오버라이딩한 클래스C를  타입클래스 A 형변환!하여 타입A로 제한된 C 실행!! 	
// 2. 오버라이딩한 클래스C를 타입클래스 C 그대로 사용할때 차이점을 아래와 같이 비교 		
	A c1 = new C();   
		c1.methodA();
	//	c1.methodC(); // Error이유: A c1 = new C(); 선언때문에, c클래스가 타입클래스 A에 있는 멤버로만 제한되어 사용된다. 
		System.out.println(c1.methodA());
	C c2 = new C(); 
		c2.methodA(); // C클래스에서  methodA 필드 =실행부를 overriding 덮어쓰기한 결과가 출력
		c2.methodC(); // 
		 System.out.println(c2.methodA());
		 System.out.println(c2.methodC());
		
	} // END main
} // END class AaNewB


class A{
   public String methodA () { 
	return "methodA";
  }
} // END class A 

class B extends A {  // 상속기능을 넣어준다. 
	public String methodB() {
		return "methodB";
	}	
} // END class B 

class C extends A {
	public String methodA(){
		return "overriding methodA in C class";
	}
	public String methodC(){
		return "methodC";
	}
} // END class C

