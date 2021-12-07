package linkedlist01;

//1. what is the difference( or feature) between a linked list and an array? 

//1번에 대한 답: 1) ArrayList 장점 :  논리적 순서와 물리적 순서가 일치한다.. 따라서 (index 값)을 통한 원소 (접근이 용이)하며, 구현이 쉽다
//              ArrayList 단점  : 삽입, 삭제 등 연산에 필요한 Cost가 높다는 것이다. (삽입, 삭제)의 경우 순서를 맞추기 위해 (이동하는 원소)가 많아진다. 

//            2) LinkedList : 논리적 순서대로 되어 있지만 물리적으로는 순서대로 되어 있지 않다. 각 원소가 (다음 index 위치)에 해당하는 물리적 주소를 가지고 있다.
//              삽입, 삭제의 경우  array랑 다르게 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다
//              LinkedList 단점:  추가나 삭제가 용이하지만 특정 요소에 접근하기 위해서는 (순차 탐색)이 필요.  (속도가 떨어진다)




//2. Declare the structure that represents the node of single linked list and has a character data 
//2번에 대한 답:  각 노드가 데이터와 포인터를 가지고 한 줄로 연결되어 있는 방식의 자료구조이다. 
//data를 담고 있는 노드들이 연결되어 있고, 노드의 포인터가 이전 노드와 다음 노드와의 연결을 담당한다.


public class Main {

	public static void main(String[] args) 
	   {  // LinkedList 객체생성  
	      LinkedList numbers = new LinkedList(); // numbers 변수에 담을예정
	      numbers.addFirst("d");    // [d]
	      numbers.addFirst("b");    // [b,d] 
	      numbers.addFirst("a");    // [a,d,b]
	      
	      System.out.println(numbers);  //  출력: [a,d,b]  이며 인덱스는 0,1,2
	      
	      // index2번 자리, 즉 "d" 자리에 "c"값을 insert 하고 d는 뒤 자리로 밀려나 존재  
	      numbers.add(2, "c");
	      System.out.println(numbers);  // 출력: [a,b,c,d]
	   }
	
} 