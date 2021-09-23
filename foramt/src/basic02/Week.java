package basic02;


import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
	import java.util.Locale;
	public class Week {
	   public static void main(String[] args) {
	      Locale locale1 = Locale.getDefault();
	      Locale locale2 = Locale.FRENCH;
	      
	      // ��
	      System.out.printf("%s%n", DayOfWeek.SUNDAY.minus(2).getDisplayName(TextStyle.SHORT, locale1)); 
	     // �����
	      System.out.printf("%s%n", DayOfWeek.SUNDAY.minus(2).getDisplayName(TextStyle.FULL, locale1)); 
	      // mar. 
	      System.out.printf("%s%n", DayOfWeek.SUNDAY.minus(2).getDisplayName(TextStyle.SHORT, locale2));
	      // mardi
	      System.out.printf("%s%n", DayOfWeek.SUNDAY.minus(2).getDisplayName(TextStyle.FULL, locale2));
	      
	     LocalDateTime now = LocalDateTime.now();
	  // 07�� 11��(��)
	   String ko = now.format(DateTimeFormatter.ofPattern("MM�� dd��(E)").withLocale(Locale.forLanguageTag("ko")));
	   System.out.println(ko);
	  // 07�� 11��(��)
	   String ja = now.format(DateTimeFormatter.ofPattern("MM�� dd��(E)").withLocale(Locale.forLanguageTag("ja")));
	   System.out.println(ja);
	      
	   }
}
