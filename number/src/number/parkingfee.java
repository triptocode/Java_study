package number;

public class parkingfee {
	public static void main (String[] args) {
		
//		상황1 진입부터 비용발생,30분마다 1천원 비용이 추가되는 주차장 비용은? 

//		준비 : 이용시간
		int hour = 2 , minute = 1;
		
		int term = 30;//기준시간(분)
		int termPrice = 1000;//기준요금(원)
		
//		계산 : 이용시간(분) , 요금
		int time = hour * 60 + minute;
//		System.out.println(time);
		
		int price = time / term * termPrice + termPrice;
		
//		출력
		System.out.println("주차비용1: "+price+"원");
	
		

//		상황2 진입시간과 진출시간, 30분안에는 무료,30분이후부터 1000원발생하는 주차비 계산
//		준비
		int inHour = 10 , inMinute = 20;
		int outHour = 11 , outMinute = 25;
		
//		계산 : 진입시간(분), 진출시간(분), 주차시간(분), 주차요금(원)
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		int staytime = outTime - inTime;
		int cost = staytime / 30 * 1000;
		
//		출력
		System.out.println("주차비용2: "+cost+"원");
		
	} 
	
}
