package basic;

class Cal{ 

	int sum(int a, int b) {
	return a+b;
    }	
	
	// overloading
	int sum(int a, int b, int c) {
		return this.sum(a, b)+c;
		//return a+b+c;
		
	}
}


// ���  : Cal2�� Cal ����� Ȯ���Ų��. 
class Cal2 extends Cal{               // ���Ȯ��: Cal2=c2 �� Cal=c �ż���(sum)�� �޾Ҵ�. 
	
	int minus(int a, int b) {
		return a-b;
	}
	
	// overriding
	int sum(int a, int b) {
		System.out.println("Cal2");
		return super.sum(a, b);
	//	return a+b;
	}
		
	
}


public class Inheritance { 
	
	public static void main(String[] args) {
	
		Cal c = new Cal();
		Cal2 c2 = new Cal2();
		
   System.out.println(c.sum(2,1));
// System.out.println(c.minus(2,1));    // �����߻�: Cal=c �� Cal2=c2 �ż���(minus)�� ������ �ƴϴ�. 
 
   System.out.println(c2.sum(4,1));     // ���Ȯ��: Cal2=c2 �� Cal=c �ż���(sum)�� �޾Ҵ�. 
   System.out.println(c2.minus(2,1));

}
	

}
