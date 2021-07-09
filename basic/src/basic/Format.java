package basic;

import java.util.Calendar;
import java.util.Locale;

public class Format {
	 public static void main(String[] args) {
	      
		 // System.out.printf()=System.out.format()
		
		 Calendar c = Calendar.getInstance();  
	      System.out.printf("%tB%n", c); // 07 
	      System.out.format("%tm%n", c); // 07
	      System.out.format("%tB%n", c); // 7월
	      System.out.format("%tB %te, %tY%n", c, c, c); // --> 7월 9, 2021 / (현재 월,일,연도)
	      System.out.format("%tp%tI:%tM%n", c, c, c);  // -->오전11:03  / (현재시간)
	      System.out.format("%tD%n", c);    // -->  07/09/21  / (현재 월,일,연도)
		 
		 long n = 461012;
	       
	      System.out.format("%d%n", n);      //  -->  461012
	      System.out.format("%08d%n", n);    //  -->  00461012
	      System.out.format("%+8d%n", n);    //  -->   +461012
	      System.out.printf("%8d%n",n);      //         461012
	      System.out.format("%,8d%n", n);    // -->    461,012
	      System.out.format("%+,8d%n%n", n); //  -->  +461,012
	      
	      double pi = Math.PI;

	      System.out.format("%f%n", pi);       // -->  3.141593
	      System.out.format("%.3f%n", pi);     // -->  3.142
	      System.out.format("%10.3f%n", pi);   // -->       3.142
	      System.out.format("%-10.3f%n", pi);  // -->  3.142
	      System.out.format(Locale.FRANCE,
	                        "%-10.4f%n%n", pi); // -->  3,1416
     
	    }

}
