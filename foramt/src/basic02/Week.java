package basic02;


import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
	import java.util.Locale;
	public class Week {
	   public static void main(String[] args) {
	      Locale locale = Locale.getDefault();
	      Locale locale1 = Locale.CANADA;
	      
	      // 목
	      System.out.printf("%s%n", DayOfWeek.THURSDAY.minus(0).getDisplayName(TextStyle.SHORT, locale)); 
	      // Tue 
	      System.out.printf("%s%n", DayOfWeek.THURSDAY.minus(2).getDisplayName(TextStyle.SHORT, locale1));
	      // Tuesday
	      System.out.printf("%s%n", DayOfWeek.THURSDAY.minus(2).getDisplayName(TextStyle.FULL, locale1));
	      
	      LocalDateTime now = LocalDateTime.now();
	     String ko = now.format(DateTimeFormatter.ofPattern("MM월 dd일(E)").withLocale(Locale.forLanguageTag("ko")));
	      System.out.println(ko);
	      String ja = now.format(DateTimeFormatter.ofPattern("MM월 dd일(E)").withLocale(Locale.forLanguageTag("ja")));
	      System.out.println(ja);
	      
	   }
}
