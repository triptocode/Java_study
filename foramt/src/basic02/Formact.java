package basic02;

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
		 
			 Calendar c = Calendar.getInstance();  
		      System.out.printf("%tm%n", c); // 07
		      System.out.format("%tm%n", c); // 07
		      
		      System.out.format("%tB%n", c); // 7��
		      // �Ʒ��ڵ�--> 7�� 9, 2021 / (���� ��,��,����)
		      System.out.format("%tB %te, %tY%n", c, c, c);
		      // �Ʒ��ڵ�-->���� 11:03  / (����ð�)
		      System.out.format("%tp %tI:%tM %n", c, c, c);  
		      // �Ʒ��ڵ�-->  07/09/21  / (���� ��,��,����)
		      System.out.format("%tD%n%n", c);   
			 
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
