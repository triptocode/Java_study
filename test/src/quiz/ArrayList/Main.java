package quiz.ArrayList;

// 1. what is the difference( or feature) between a linked list and an array? 

// 1���� ���� ��: 1) array:  ���� ������ ������ ������ ��ġ�Ѵ�.. ���� index ���� ���� ���� ������ �����ϸ�, ������ ���ٴ� 
//            array ������ ����, ���� �� ���꿡 �ʿ��� Cost�� ���ٴ� ���̴�. ����, ������ ��� ������ ���߱� ���� �̵��ϴ� ���Ұ� ��������. 
//           2) linked list: �������� ������� �Ǿ� ������ ���������δ� ������� �Ǿ� ���� �ʴ�. �� ���Ұ� ���� index ��ġ�� �ش��ϴ� ������ �ּҸ� ������ �ִ�.
//             ����, ������ ���  array�� �ٸ��� �յ� ��ũ�� ����ǰ� ������ ��ũ�� ������� �ʴ´�
//            linked list ����:  �߰��� ������ ���������� �ε����� ���� ������ Ư�� ��ҿ� �����ϱ� ���ؼ��� ���� Ž���� �ʿ��Ͽ� �ӵ��� ��������. 




// 2. Declare the structure that represents the node of single linked list and has a character data 
// 2���� ���� ��:  �� ��尡 �����Ϳ� �����͸� ������ �� �ٷ� ����Ǿ� �ִ� ����� �ڷᱸ���̴�. 
// data�� ��� �ִ� ������ ����Ǿ� �ְ�, ����� �����Ͱ� ���� ���� ���� ������ ������ ����Ѵ�.


public class Main {
   
	public static void main(String[] args) 
	   {  // LinkedList ��ü����  
	      LinkedList numbers = new LinkedList(); // numbers ������ ��������
	      numbers.addFirst("d");
	      numbers.addFirst("b");
	      numbers.addFirst("a");
	      
	      // index2�� �ڸ�, �� "b"�� "d"���̿� "c"���� insert �ϱ����� �Ʒ��ڵ���
	      numbers.add(2, "c");
	      System.out.println(numbers);
	   }
	
}
	 


