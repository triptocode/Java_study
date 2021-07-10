package basic02;

import java.sql.Date;
import java.util.Calendar;
import java.util.Locale;

public class Formact {

	 public static void main(String[] args) {
	      
		// System.out.printf()=System.out.format()
		 //주의: 입력시 "" String 따옴표형식  활용
		// %n 줄바꿈  
		// 월: %tB, %tm 
		// %5d: %와 d 사이에 정수를 설정하면 글자길이가 정해진다. 
		// 기본적으로 오른쪽 정렬이고, -를 붙이면 왼쪽정렬 
		 
			 Calendar calendar = Calendar.getInstance();  
		      System.out.printf("%tm %n", calendar); // 07
		      System.out.format("%tm %n", calendar); // 07
		      
		      System.out.format("%tB %n", calendar); // 7월
		      // 아래코드--> 7월 9, 2021 / (현재 월,일,연도)
		      System.out.format("%tB %te %tY %n", calendar, calendar, calendar);
		      // 아래코드-->오전 11:03  /(오전, 시 ,분 )
		      System.out.format("%tp %tI:%tM %n", calendar, calendar, calendar);  
		      // 아래코드-->  07/09/21  / (현재 월,일,연도)
		      System.out.format("%tD %n%n", calendar);  
		      
		      // Date ! , locale 국가설정  
		      Date today = new Date(0);
		      System.out.println(String.format(Locale.KOREAN, "%tp",today)); //am
		      System.out.println(String.format(Locale.ENGLISH, "%Tp",today)); //AM
		      System.out.println(today+"\n");
		      
		      System.out.println(String.format(" %tF ", today));
		      System.out.println(String.format(" %tT, %tR ", today, today));// (시,분,초) (시,분)
		      System.out.println(String.format(" %ty,  %tY", today, today));	// 연도 뒷두자리, 연도 네자리 	
		      System.out.println(String.format(" %tm", today)); // 01  
		      System.out.println(String.format(" %td, %te", today, today));  //01, 1

		      System.out.println(String.format("%tH", today)); // 09 /timezone GMT라 한국현재시간과 다르게 출력
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
		  // --> .3 은 소수점자리이하 3개를 의미 
		      System.out.format("%.3f%n", pi);     // -->  3.142   
		  // -->아래코드 결과:       3.142  / 앞 공백5개, 뒤에 . 포인트 포함 5개까지 총10자리
		      System.out.format("%10.3f%n", pi);   
		      System.out.format("%-10.3f%n", pi);  // -->  3.142
		      System.out.format(Locale.FRANCE,
		                        "%-10.4f%n%n", pi); // -->  3,1416
		      
		      int i = 123;
		      System.out.printf("%5d %n",i); // %와 d사이 정수를 쓰면 글자길이가 정해진다. 
		      //  123: 오른쪽정렬(default), 앞자리2개는 공백으로 채워진다.
		      System.out.printf("%-5d",i); 
		      //123  : 왼쪽정렬, 뒷자리2개는 공백으로 채워진다. 
	 }	
}
