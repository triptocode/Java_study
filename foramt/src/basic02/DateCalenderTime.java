package basic02;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


    //   < Java �ð� API �ô� �帧 ���� ?
	//   1. java.util.Date 
	//   2. java.util.Calendar 
	//   3. java.time(org.joda.time)   - �����ֽ�, Java 8 ���� java.time(joda.time) api ���
	
public class DateCalenderTime {
	
	
	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥: "+currentDate);
	
	      DayOfWeek dayOfWeek  = currentDate.getDayOfWeek();
	      System.out.println("���� ����: "+dayOfWeek);
	      
	   
	         if (dayOfWeek == DayOfWeek.MONDAY) {
	        	currentDate= currentDate.minusDays(3);  //����! minus(-3)��  --= + , �� ���  
	         }else if (dayOfWeek == DayOfWeek.SUNDAY) { // minus��� ��� �̹� ������ȣ�̴�.
	        	 currentDate=currentDate.minusDays(2);
	         }else {
	        	 currentDate=currentDate.minusDays(1);
	         }
	      
	      System.out.println("������ ���� ������ �ش��ϴ� ��¥: "+currentDate);
	      
	      LocalDate customizedDate = LocalDate.of(2021,05,12);
	      System.out.println("LocalDate.of(��,�� ,�� ): "+customizedDate);
	      
	      LocalTime currentTime = LocalTime.now();
	      System.out.println("LocalTime.now(): "+currentTime);
	      LocalTime customizedTime = LocalTime.of(12,30,35,10); 
	      System.out.println("LocalTime.of(��,��,��,nanoSec��������): "+customizedTime);
	      System.out.println("���� �ð��� " + currentTime.getHour() + "�� " + currentTime.getMinute() + "���Դϴ�.");
		
	      
	 LocalDateTime currentDateTime = LocalDateTime.now();   
	 System.out.println("LocalDateTime.now(): "+currentDateTime);
	 LocalDateTime customizedDateTime = LocalDateTime.of(2030, 05,20, 12,50,45,55555);
	 System.out.println("LocaldDateTime.of(��,��,��,��,��,��,������): "+customizedDateTime);
	}
	
}
