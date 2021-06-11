package number;

import java.lang.*;
import java.util.Calendar;

public class birthdateCalendar {
	public static void main(String[] args) {
		
		//입력
				int birthday = 20001020;
				
				//계산
				int year = birthday / 10000; //4자리를 버린 후 왼쪽 값
				int month = birthday / 100 % 100;//2자리 버린 후 오른쪽 2자리		
				int day = birthday % 100;//오른쪽 2자리
				
				//올해 연도 구하기
				int thisyear = Calendar.getInstance().get(Calendar.YEAR);
				int age = thisyear - year + 1;
				
				//출력	
				System.out.println("올해연도: "+thisyear);
				System.out.println("생년월일: "+birthday);
				System.out.println("탄생 연도: "+year);
				System.out.println("탄생 월: "+month);
				System.out.println("탄생 일: "+day);
				System.out.println("나이: "+age);
	
	


	}
	}
