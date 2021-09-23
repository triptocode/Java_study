package polymorphism;

public class AaNewB {

	public static void main(String[] args) {
		
// 1. Ŭ����B��  Ÿ��Ŭ���� A ����ȯ!�Ͽ� Ÿ��A�� ���ѵ� B ����!! 	
// 2. Ŭ����B�� Ÿ��Ŭ���� B �״�� ����Ҷ� �������� �Ʒ��� ���� �� 	
		
	A b1 = new B(); // Ŭ����B�� Ŭ����AŸ������ ����ȯ!!! Ÿ��A�� ���ѵ� ����θ� ��ӹ���BŬ������ ����!! 
		b1.methodA();  
	//	b1.methodB(); 
	
	//	�Ʒ�ó�� Ÿ��Ŭ����B�� new B�� �����ϸ�, A�� ��ӱ���� ���� BŸ���� �۵��Ǿ� Ŭ���� A�� B�� �ִ� ��� ����� ��밡��������. 	
		
	B b2 = new B(); 
		b2.methodA();
		b2.methodB(); 		
		System.out.println(b2.methodA());
		System.out.println(b2.methodB());	

// 1. �������̵��� Ŭ����C��  Ÿ��Ŭ���� A ����ȯ!�Ͽ� Ÿ��A�� ���ѵ� C ����!! 	
// 2. �������̵��� Ŭ����C�� Ÿ��Ŭ���� C �״�� ����Ҷ� �������� �Ʒ��� ���� �� 		
	A c1 = new C();   
		c1.methodA();
	//	c1.methodC(); // Error����: A c1 = new C(); ���𶧹���, cŬ������ Ÿ��Ŭ���� A�� �ִ� ����θ� ���ѵǾ� ���ȴ�. 
		System.out.println(c1.methodA());
	C c2 = new C(); 
		c2.methodA(); // CŬ��������  methodA �ʵ� =����θ� overriding ������� ����� ���
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

class B extends A {  // ��ӱ���� �־��ش�. 
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

