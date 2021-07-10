package basic02;

import java.sql.Date;
import java.util.Calendar;
import java.util.Locale;

public class Formact {

	 public static void main(String[] args) {
	      
		// System.out.printf()=System.out.format()
		 //����: �Է½� "" String ����ǥ����  Ȱ��
		// %n �ٹٲ�  
		// ��: %tB, %tm 
		// %5d: %�� d ���̿� ������ �����ϸ� ���ڱ��̰� ��������. 
		// �⺻������ ������ �����̰�, -�� ���̸� �������� 
		 
			 Calendar calendar = Calendar.getInstance();  
		      System.out.printf("%tm %n", calendar); // 07
		      System.out.format("%tm %n", calendar); // 07
		      
		      System.out.format("%tB %n", calendar); // 7��
		      // �Ʒ��ڵ�--> 7�� 9, 2021 / (���� ��,��,����)
		      System.out.format("%tB %te %tY %n", calendar, calendar, calendar);
		      // �Ʒ��ڵ�-->���� 11:03  /(����, �� ,�� )
		      System.out.format("%tp %tI:%tM %n", calendar, calendar, calendar);  
		      // �Ʒ��ڵ�-->  07/09/21  / (���� ��,��,����)
		      System.out.format("%tD %n%n", calendar);  
		      
		      // Date ! , locale ��������  
		      Date today = new Date(0);
		      System.out.println(String.format(Locale.KOREAN, "%tp",today)); //am
		      System.out.println(String.format(Locale.ENGLISH, "%Tp",today)); //AM
		      System.out.println(today+"\n");
		      
		      System.out.println(String.format(" %tF ", today));
		      System.out.println(String.format(" %tT, %tR ", today, today));// (��,��,��) (��,��)
		      System.out.println(String.format(" %ty,  %tY", today, today));	// ���� �޵��ڸ�, ���� ���ڸ� 	
		      System.out.println(String.format(" %tm", today)); // 01  
		      System.out.println(String.format(" %td, %te", today, today));  //01, 1

		      System.out.println(String.format("%tH", today)); // 09 /timezone GMT�� �ѱ�����ð��� �ٸ��� ���
		      System.out.println(String.format("%tM", today)); // 00
		      System.out.println(String.format("%tS", today)); // 00 
		      System.out.println(String.format(" %tZ, %tz", today, today)); //GMT+09:00, +0900


			 
			 long n = 123456;
		       
		      System.out.format("%d%n", n);      //  -->  123456
		      System.out.format("%08d%n", n);    //  -->  00123456
		      System.out.format("%+8d%n", n);    //  -->   +123456
		      System.out.printf("%8d%n",n);      //         123456
		      System.out.format("%,8d%n", n);    // -->    123,456
		      System.out.format("%+,8d%n%n", n); //  -->  +123,456
		      
		      double pi = Math.PI;

		      System.out.format("%f%n", pi);       // -->  3.141593
		  // --> .3 �� �Ҽ����ڸ����� 3���� �ǹ� 
		      System.out.format("%.3f%n", pi);     // -->  3.142   
		  // -->�Ʒ��ڵ� ���:       3.142  / �� ����5��, �ڿ� . ����Ʈ ���� 5������ ��10�ڸ�
		      System.out.format("%10.3f%n", pi);   
		      System.out.format("%-10.3f%n", pi);  // -->  3.142
		      System.out.format(Locale.FRANCE,
		                        "%-10.4f%n%n", pi); // -->  3,1416
		      
		      int i = 123;
		      System.out.printf("%5d %n",i); // %�� d���� ������ ���� ���ڱ��̰� ��������. 
		      //  123: ����������(default), ���ڸ�2���� �������� ä������.
		      System.out.printf("%-5d",i); 
		      //123  : ��������, ���ڸ�2���� �������� ä������. 
	 }	
}
