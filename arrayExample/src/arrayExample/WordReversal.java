package arrayExample;


public class WordReversal {             // 총 두가지 방법으로 풀어봤습니다.  방법1 
	
	// Java program to reverse a string
	// s = input()
	
	 
	 public static void main(String[] args)
	    {
	       String s[] = "He has a daughter".split(" "); // " "공백을 기준으로 해당문장을 나누면, 총4개의 단어로 나누어져서 배열에 들어간다.
	       System.out.println("배열 0번: "+  s[0]); // he
	       System.out.println("배열 1번: "+  s[1]); // has 
	       System.out.println("배열 2번: "+  s[2]); // a 
	       System.out.println("배열 3번: "+  s[3]); // daughter
	        
	         String blank = "";
	        for (int i = s.length - 1; i >= 0; i--) // 배열 순서 역으로  (3,2,1,0 ) 하여 단어 순서를 거꾸러 해준다. 
	        {	blank += s[i] + " "; // 4개 단어 사이에 공백을 추가하여 띄어쓰기 적용하고, 단어간에 결합
	        }
	        
	        System.out.println("역순으로 단어 위치 바꾼 결과: "+ blank);
	    }
}