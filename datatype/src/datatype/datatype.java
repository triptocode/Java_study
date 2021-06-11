package datatype;
import java.lang.*;

class datatype {
	public static void main(String[] args) {


		// 정수 데이터타입 4개 : byte, int, long, short 
		// 실수 데이터타입 2개 : float, double
		
//		byte = 1byte = 8bit,  물리적인 파일을 다룰 때 사용 
//		byte -2^7 ~ 2^7 -1 (-128 ~ 127)

//      주의:    자바는 모든 정수값을 기본으로 int로 처리하기에 int외에는 단위붙여 계산하지 않으면 에러발생하기도!		

		byte a = (byte) -129;
		System.out.println("byte -129: "+a);
		byte aa = (byte) 127;
		System.out.println("byte 127: "+aa);
		byte aaa = (byte) 128;
		System.out.println("byte 128: "+aaa);
		byte aaaa = (byte) 129;
		System.out.println("byte 129: "+aaaa);
//		byte a = 1000;    에러발생 
		byte aaaaa = (byte) 1000;
		System.out.println("byte 1000: "+aaaaa);
		
// 		short= 2byte , -2^15 ~ 2^15 - 1(-32,768 ~32,767) 
//		short는 볼 필요 없다(지금은 안씀... 과거의 자료형)
		
//		int : 정수 기본형
//		int  = 4byte , -2,147,483,648 ~ 2,147,483,647
		
		int b = 2100000000;
		int c = 1234567 * 1234567;
		System.out.println("int 2100000000 : "+b);
		System.out.println("int 1234567 : "+c);
//		long = 8byte		
//		long : -2^31 ~ 2^31 -1 (-2,147,483,648 ~ 2,147,483,647)
		long d = 2100000000L;
		long e = 1234567L * 1234567L;
		System.out.println(d);
		System.out.println(e);
		
		byte f = 10;
		byte g = 20;
		byte h = (byte) (g + f);
		System.out.println(h);
		
		
//		성적 평균 계산
//		- 국어점수가 75점, 수학점수가 80점일 때 평균을 출력
		
		int kor = 75;
		int math = 80;
		
    	
    	double badavg = kor + math / 2.0;   // 괄호로 안묶으면 오답나옴  - 1. 괄호사용하고, 
    	double avg1 = (kor + math) / 2.0;   // 2. 소수단위 2.0 또는 (double) 붙이기
		double avg2 = (double)(kor + math) / 2;
		double avg3= (kor + math) / (double)2;
		System.out.println("괄호없는계산은 오답: "+ badavg);    
		System.out.println(avg1); 
		System.out.println(avg2);
		System.out.println(avg3);

		
		
//		bmi 수치 소수점 두자리까 지 보여주고 그 이하 생략하기. 
//		double에  x100하고(2자리 표현을위해), int단위를 씌워 정수단위로 나머지소수점 생략하는 방식
//		준비 : 신장(cm), 체중(kg)
		double cm = 180;
		double kg = 80;		
//		계산 : 신장(m) , bmi 지수
		double m = cm / 100;
//		System.out.println(m);		
		double bmi = kg / ( m * m );//kg / m / m		
//		결과
		System.out.println(bmi);

		
//		소수점 2자리까지만 표시하도록 값 수정
		bmi = bmi * 100;		//소수점 2자리 우측으로 변경
		System.out.println(bmi);
		
		bmi = (int)bmi;			//소수점 버리고
		System.out.println(bmi);
		
		bmi = bmi / 100;		//소수점 2자리 좌측으로 변경
		System.out.println(bmi);
		
//		실수의 특징
		
//		float A = 3.14;
		float A = 3.14f;
		double B = 3.14;
		
		System.out.println(A);
		System.out.println(B);
		
		float C = 1.43968713984769138467918347f;
		double D = 1.43968713984769138467918347;
		System.out.println(C);
		System.out.println(D);
		
		System.out.println(10 / 3.0);
		
//		Q : long이랑 float는 누가더 클까요? float
		float E = 1.5f;
		long F = (long) E;
		System.out.println("long: "+F);
		System.out.println("float: "+E);

		
		long G = 10L;
		float H = G;
		System.out.println("long: "+G);
		System.out.println("float: "+H);

	}
}









