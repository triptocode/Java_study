package quiz;

public class DaysToMilliseconds {
	
	 public static double  ToMilliseconds(double day) // �ݳ����̸� 0.5�Ϸ� ����ϴ°��, �Ҽ��� ǥ���� �����ϰ� int day�� double day�� ���� 
	   {
		 return 1000*36000*24*day;
		 
	   }
        public static void main (String[] args) {
        	System.out.println(ToMilliseconds(0.5));
        	
        }   
	      }
