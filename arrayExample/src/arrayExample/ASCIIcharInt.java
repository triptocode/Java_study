package arrayExample;

import java.util.Arrays;

public class ASCIIcharInt {

//char는 문자를 내부적으로 정수값 코드로 저장
//따라서 char는 정수형데이터타입( byte, short , int ,long )과 밀접한 관계가 있다.
//char는 자바에서 유니코드( 2 byte 문자 체계)를 사용하므로 2 byte
// 어떤 문자의 아스키값을 알고 싶으면, char형 변수를 정수형(int)으로 변환하면 된다. char ch='A'; int n = (int)ch;
//사용자정의클래스이거나 toString()재정의를 하지않은 클래스의 참조변수는 출력하게 되면 , 클래스타입@16진수(주소)

	public static void main(String[] args) {
		
		int arrIntNum1[] = { 1,   2 };      // 1 2  
		int arrIntNum2[] = {'1', '2', 'A' }; //아스키번호 - char 문자 입력 ' ' 형태로 넣은것에 int를 붙여서 아스키코드 출력 
		
		System.out.println("int배열변수 문자열로출력 x: "+arrIntNum1 + "에서 [는 배열을 의미 I는 int 해시값@35f983a6"); // 출력:[I@35f983a6
		System.out.println("int배열변수 문자열로출력 o: " +Arrays.toString(arrIntNum1));
		System.out.println(arrIntNum1[0]); 
		System.out.println(arrIntNum1[1]); 
		
		System.out.println("다음코드에 대한 출력: int arrNum2[] = {'1', '2','A' };");
		System.out.println("int배열변수 문자열로출력 x: "+arrIntNum2 + "에서 [는 배열을 의미 I는 int 해시값@6d06d69c"); // 출력: [I@7f690630
		System.out.println("int배열변수 문자열로출력 o: " +Arrays.toString(arrIntNum2));
		System.out.println(arrIntNum2[0]); //49 1 을 '1'로 int타입에 input하면 아스키코드값 도출. ex:문자1은 아스키값 49출력
		System.out.println(arrIntNum2[1]); //50
		System.out.println(arrIntNum2[2]); //65  'A' 
		// int  n[] = {'1','2', 'A'}; System.out.println(n[2]);  이줄에 코드는 아래코드와 똑같은 A문자의 아스키값이 출력
		char ch = 'A';  int n = (int)ch;  System.out.println(n); // 65
		
		int AsciiNum = 65;
		System.out.println((char)AsciiNum); //A
		
		char arrCharNum[] = { '1','2', '3'};
		System.out.println(arrCharNum);    // 출력: 123 
		System.out.println(arrCharNum[0]); // 출력: 1
		
		char arrCharABC[] = {'a','b','c'};
		System.out.println(arrCharABC);    // 출력: a b c 
		System.out.println(arrCharABC[0]); // 출력: a 
	    }
}


