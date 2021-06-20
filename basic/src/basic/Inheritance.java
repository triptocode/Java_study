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


// 상속  : Cal2가 Cal 기능을 확장시킨다. 
class Cal2 extends Cal{               // 기능확장: Cal2=c2 가 Cal=c 매서드(sum)를 받았다. 
	
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
// System.out.println(c.minus(2,1));    // 오류발생: Cal=c 이 Cal2=c2 매서드(minus)를 받은게 아니다. 
 
   System.out.println(c2.sum(4,1));     // 기능확장: Cal2=c2 가 Cal=c 매서드(sum)를 받았다. 
   System.out.println(c2.minus(2,1));

}
	

}
