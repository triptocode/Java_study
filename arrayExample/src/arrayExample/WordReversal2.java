package arrayExample;

import java.util.Stack; 

public class WordReversal2 {                // // 총 두가지 방법으로 풀어봤습니다.  방법2 
	
	public static void main(String[] args) {
	      Stack<String> stack = new Stack<>();         // stack 은 LIFO 구조. 가장마지막에 들어간 데이터가 가정먼저 나오는 LastInFirstOut
	      String sentence = "He has a daughter";
	      String word[] = sentence.split(" ");         // " "공백을 기준으로 해당문장을 나누면, 총4개의 단어로 나누어져서 배열에 들어간다
	       for (String str : word) stack.push(str);     // push로 단어를 입력하고 
	       while (!stack.empty()) System.out.print(stack.pop()+" "); // pop 으로 단어를 꺼낸다. 스택은  LIFO 구조라서 순서가 역으로 적용이 된다. 
	    }
}