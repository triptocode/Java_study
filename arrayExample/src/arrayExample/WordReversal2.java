package arrayExample;

import java.util.Stack; 

public class WordReversal2 {                // // �� �ΰ��� ������� Ǯ��ý��ϴ�.  ���2 
	
	public static void main(String[] args) {
	      Stack<String> stack = new Stack<>();         // stack �� LIFO ����. ���帶������ �� �����Ͱ� �������� ������ LastInFirstOut
	      String sentence = "He has a daughter";
	      String word[] = sentence.split(" ");         // " "������ �������� �ش繮���� ������, ��4���� �ܾ�� ���������� �迭�� ����
	       for (String str : word) stack.push(str);     // push�� �ܾ �Է��ϰ� 
	       while (!stack.empty()) System.out.print(stack.pop()+" "); // pop ���� �ܾ ������. ������  LIFO ������ ������ ������ ������ �ȴ�. 
	    }
}