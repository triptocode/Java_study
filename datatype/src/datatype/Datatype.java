package datatype;

public class Datatype {
	
	public static void main(String[] args) {

		
//  1 byte = 8bits 		
//		byte	1 byte	-128 ~ 127    
//		short	2 byte	-32,768 ~ 32,767
//		int	    4 byte	-2,147,483,648~2,147,483,647
//		long	8 byte	-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
//		
//		
	// 정수타입을 bits 사이즈로  출력	
		System.out.println(Byte.SIZE+" "+Short.SIZE+" "+Integer.SIZE+" "+Long.SIZE);
	 
	    byte byteMax = 127;
	    System.out.println(byteMax);
		System.out.println("127: "+Integer.toBinaryString(byteMax));
		
//		byte overByteMax = 129;        // 에러  : 바이트는 -128~127 범위까지 표현가능한데 넘는범위 입력으로 오류 
		byte overByteMax = (byte)129;  // OK  :  (byte)를 숫자앞에 써주면 범위를 넘어서는 숫자표현도 가능해진다. 다만 integer 범위 4byte 32bits로 표현되고 앞자리는 모두 부호비트랑 동일하게 바뀜. 
		System.out.println("(byte)129: "+overByteMax);
		System.out.println("(byte)129: "+Integer.toBinaryString(overByteMax) +" [Integer.toBinaryString()를 사용하면 byte 8bits가  int 4byte= 32bits로 표현된다.]");	
		
		byte byteMinimum = -128;
		System.out.println(byteMinimum);
		
//		byte overByteMinimum = -129;    에러 
//		System.out.println(overByteMinimum);
		
	// 1byte=8bits 0000 0000 ~ 1111 1111  
	// 십진법계산: 2^0 부터2^7까지  
	// 주의! 경우의수: 2^1부터 2^8까지 !  부호비트2^8 자리수를 제외하면 숫자범위는 2^1부터  생겨서 2^7 =128 가지의 경우의수가 생기고 
	// 그중 2^8 자릿대는 부호(sign)비트로 0은 양수, 1은 음수 두가지 버전으로 128가지 숫자범위를 2^8 부호비트 자리가 0(+) 과 1(-)로 변하면서128x2 개 버전의 경우의수가 생긴다.   	
	//   0 ~ 127 (128개 경우의수 양수버전) 
	// -1 ~ -128 (128개 경우의수 음수버전) 	
	//	 양 000 0000~ 양 111 1111 :  0 000 0000~ 0 111 1111
	//  음 111 1111~ 음 000 0001 :	 1 111 1111~ 1 000 0000 
		
		// 1 byte는 8bits이지만 1비트 모자란 7bits인 128개 숫자범위로( -128 ~ 127 ) 표현되는 이유. 그 대신 음수양수 두버전이 나오는이유는 아래와같다.   (128개 경우의수)
		// 1 byte = 8bits 이지만 맨앞 1비트는 부호비트로 사용하여 남는 7비트로 숫자를 구성. 
		// 2^7=128개 표현가능. 0부터 시작이기에 127까지 표현가능. 
		// 앞에 1비트를 음수로하면 다시 음수버전 2^7=128개 표현가능. 음수는 1부터 시작이라 128까지 표현.
		// 즉 1byte 는 8bits이지만 부호비트 하나가 빠진 2^7 을 활용한 숫자까지 도출이되지만 음수 양수 버전 두가지로 범위가 나온다. 
	}

}
