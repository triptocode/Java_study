package basic02;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


    //   < Java 시간 API 시대 흐름 순서 ?
	//   1. java.util.Date 
	//   2. java.util.Calendar 
	//   3. java.time(org.joda.time)   - 가장최신, Java 8 부터 java.time(joda.time) api 출시
	
public class DateCalenderTime {
	
	
	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜: "+currentDate);
	
	      DayOfWeek dayOfWeek  = currentDate.getDayOfWeek();
	      System.out.println("현재 요일: "+dayOfWeek);
	      
	   
	         if (dayOfWeek == DayOfWeek.MONDAY) {
	        	currentDate= currentDate.minusDays(3);  //주의! minus(-3)은  --= + , 즉 양수  
	         }else if (dayOfWeek == DayOfWeek.SUNDAY) { // minus라고 적어서 이미 음수부호이다.
	        	 currentDate=currentDate.minusDays(2);
	         }else {
	        	 currentDate=currentDate.minusDays(1);
	         }
	      
	      System.out.println("영업일 기준 전날에 해당하는 날짜: "+currentDate);
	      
	      LocalDate customizedDate = LocalDate.of(2021,05,12);
	      System.out.println("LocalDate.of(년,월 ,일 ): "+customizedDate);
	      
	      LocalTime currentTime = LocalTime.now();
	      System.out.println("LocalTime.now(): "+currentTime);
	      LocalTime customizedTime = LocalTime.of(12,30,35,10); 
	      System.out.println("LocalTime.of(시,분,초,nanoSec생략가능): "+customizedTime);
	      System.out.println("현재 시각은 " + currentTime.getHour() + "시 " + currentTime.getMinute() + "분입니다.");
		
	      
	 LocalDateTime currentDateTime = LocalDateTime.now();   
	 System.out.println("LocalDateTime.now(): "+currentDateTime);
	 LocalDateTime customizedDateTime = LocalDateTime.of(2030, 05,20, 12,50,45,55555);
	 System.out.println("LocaldDateTime.of(년,월,일,시,분,초,나노초): "+customizedDateTime);
	}
	
}
