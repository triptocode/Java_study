package linkedlist01;

//1. what is the difference( or feature) between a linked list and an array? 

//1���� ���� ��: 1) array ���� :  ���� ������ ������ ������ ��ġ�Ѵ�.. ���� (index ��)�� ���� ���� (������ ����)�ϸ�, ������ ����
//              array ����  : ����, ���� �� ���꿡 �ʿ��� Cost�� ���ٴ� ���̴�. (����, ����)�� ��� ������ ���߱� ���� (�̵��ϴ� ����)�� ��������. 

//            2) linked list: ���� ������� �Ǿ� ������ ���������δ� ������� �Ǿ� ���� �ʴ�. �� ���Ұ� (���� index ��ġ)�� �ش��ϴ� ������ �ּҸ� ������ �ִ�.
//          ����, ������ ���  array�� �ٸ��� �յ� ��ũ�� ����ǰ� ������ ��ũ�� ������� �ʴ´�
//         linked list ����:  �߰��� ������ ���������� (�ε����� ���� ������) Ư�� ��ҿ� �����ϱ� ���ؼ��� (���� Ž��)�� �ʿ�. (�ε��������� �ٷ� ã�� ���ϰ� �ӵ��� ��������). 




//2. Declare the structure that represents the node of single linked list and has a character data 
//2���� ���� ��:  �� ��尡 �����Ϳ� �����͸� ������ �� �ٷ� ����Ǿ� �ִ� ����� �ڷᱸ���̴�. 
//data�� ��� �ִ� ������ ����Ǿ� �ְ�, ����� �����Ͱ� ���� ���� ���� ������ ������ ����Ѵ�.


public class Main {

	public static void main(String[] args) 
	   {  // LinkedList ��ü����  
	      LinkedList numbers = new LinkedList(); // numbers ������ ��������
	      numbers.addFirst("d");    // [d]
	      numbers.addFirst("b");    // [b,d] 
	      numbers.addFirst("a");    // [a,d,b]
	      
	      System.out.println(numbers);  //  ���: [a,d,b]  �̸� �ε����� 0,1,2
	      
	      // index2�� �ڸ�, �� "d" �ڸ��� "c"���� insert �ϰ� d�� �� �ڸ��� �з��� ����  
	      numbers.add(2, "c");
	      System.out.println(numbers);  // ���: [a,b,c,d]
	   }
	
} 