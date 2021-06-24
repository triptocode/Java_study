package quiz;

public class DaysToMilliseconds {
	
	 public static double  ToMilliseconds(double day) // 반나절이면 0.5일로 계산하는경우, 소수점 표현이 가능하게 int day를 double day로 수정 
	   {
		 return 1000*36000*24*day;
		 
	   }
        public static void main (String[] args) {
        	System.out.println(ToMilliseconds(0.5));
        	
        }   
	      }
