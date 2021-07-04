package arrayExample;

import java.util.Arrays;

public class ASCIIcharInt {


	public static void main(String[] args) {
		
		int arrNum1[] = {1, 2, 3 };
		int arrNum2[] = {'1', '2', '3','A' };

		System.out.println(arrNum1[0]);
		System.out.println(arrNum1[1]);
		System.out.println(arrNum1[2]);
		System.out.println("int배열 문자열로출력 x: "+arrNum1 + "[는 배열을 의미 I는 int 해시값@35f983a6");  // 출력:[I@35f983a6
		System.out.println("int배열 문자열로출력 o: " +Arrays.toString(arrNum1));
		
		System.out.println("다음코드에 대한 출력: int arrNum2[] = {'1', '2', '3' };");
		System.out.println(arrNum2[0]+" 1 을 '1'로 int타입에 input하면 아스키코드에서 문자1은 49여서 49로나옴");
		System.out.println(arrNum2[1]); //50
		System.out.println(arrNum2[2]); //51
		System.out.println(arrNum2[3]); //65  
		System.out.println("int배열 값'' 문자열출력 x: "+arrNum2); // 출력: [I@7f690630
		
		char arrCharNum[] = { '1','2', '3'};
		System.out.println(arrCharNum[0]); // 출력: a
		System.out.println(arrCharNum[1]);
		System.out.println(arrCharNum[2]);
		System.out.println(arrCharNum);    // 출력: abc 
		
		char arrCharABC[] = {'a','b','c'};
		System.out.println(arrCharABC[0]); 
		System.out.println(arrCharABC[1]);
		System.out.println(arrCharABC[2]);
				
	 }
	}


