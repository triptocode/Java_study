package datatype;
import java.lang.*;

class datatype {
	public static void main(String[] args) {


		// ���� ������Ÿ�� 4�� : byte, int, long, short 
		// �Ǽ� ������Ÿ�� 2�� : float, double
		
//		byte = 1byte = 8bit,  �������� ������ �ٷ� �� ��� 
//		byte -2^7 ~ 2^7 -1 (-128 ~ 127)

//      ����:    �ڹٴ� ��� �������� �⺻���� int�� ó���ϱ⿡ int�ܿ��� �����ٿ� ������� ������ �����߻��ϱ⵵!		

		byte a = (byte) -129;
		System.out.println("byte -129: "+a);
		byte aa = (byte) 127;
		System.out.println("byte 127: "+aa);
		byte aaa = (byte) 128;
		System.out.println("byte 128: "+aaa);
		byte aaaa = (byte) 129;
		System.out.println("byte 129: "+aaaa);
//		byte a = 1000;    �����߻� 
		byte aaaaa = (byte) 1000;
		System.out.println("byte 1000: "+aaaaa);
		
// 		short= 2byte , -2^15 ~ 2^15 - 1(-32,768 ~32,767) 
//		short�� �� �ʿ� ����(������ �Ⱦ�... ������ �ڷ���)
		
//		int : ���� �⺻��
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
		
		
//		���� ��� ���
//		- ���������� 75��, ���������� 80���� �� ����� ���
		
		int kor = 75;
		int math = 80;
		
    	
    	double badavg = kor + math / 2.0;   // ��ȣ�� �ȹ����� ���䳪��  - 1. ��ȣ����ϰ�, 
    	double avg1 = (kor + math) / 2.0;   // 2. �Ҽ����� 2.0 �Ǵ� (double) ���̱�
		double avg2 = (double)(kor + math) / 2;
		double avg3= (kor + math) / (double)2;
		System.out.println("��ȣ���°���� ����: "+ badavg);    
		System.out.println(avg1); 
		System.out.println(avg2);
		System.out.println(avg3);

		
		
//		bmi ��ġ �Ҽ��� ���ڸ��� �� �����ְ� �� ���� �����ϱ�. 
//		double��  x100�ϰ�(2�ڸ� ǥ��������), int������ ���� ���������� �������Ҽ��� �����ϴ� ���
//		�غ� : ����(cm), ü��(kg)
		double cm = 180;
		double kg = 80;		
//		��� : ����(m) , bmi ����
		double m = cm / 100;
//		System.out.println(m);		
		double bmi = kg / ( m * m );//kg / m / m		
//		���
		System.out.println(bmi);

		
//		�Ҽ��� 2�ڸ������� ǥ���ϵ��� �� ����
		bmi = bmi * 100;		//�Ҽ��� 2�ڸ� �������� ����
		System.out.println(bmi);
		
		bmi = (int)bmi;			//�Ҽ��� ������
		System.out.println(bmi);
		
		bmi = bmi / 100;		//�Ҽ��� 2�ڸ� �������� ����
		System.out.println(bmi);
		
//		�Ǽ��� Ư¡
		
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
		
//		Q : long�̶� float�� ������ Ŭ���? float
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









