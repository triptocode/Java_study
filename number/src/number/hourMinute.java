package number;
import java.lang.*;

public class hourMinute {
	public static void main(String[] args) {
	
//	입력  (어제 오늘 공부시간 비교)
	int yestHour = 3, yestMin = 20;
	int todayHour = 2, todayMin = 50;
	
//	계산
//	- 어제 공부한 시간(분) , 오늘 공부한 시간(분) , 합계 , 차이
	int yesTime = yestHour * 60 + yestMin;
	int todayTime = todayHour * 60 + todayMin;
	
	int totalTime = yesTime + todayTime;
	int gapTime = yesTime - todayTime;
	
//	출력
	System.out.println("어제 오늘 공부시간 합계");
	System.out.println(totalTime / 60+"시간"+totalTime % 60+"분");
	System.out.println("어제 오늘 공부시간 차이");
	System.out.println(gapTime / 60+"시간" +gapTime % 60 +"분" );

}
}
