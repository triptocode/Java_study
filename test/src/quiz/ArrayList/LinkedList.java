package quiz.ArrayList;

public class LinkedList 
{   private Node head; // 첫번째 노드
	private Node tail; // 제일끝 노드를 알려주는 정보가 담긴 tail 
	private int size = 0; // 몇개의 element가 존재하는지

	private class Node
	{	private Object data;
		private Node next;
		
		public Node(Object input) {
			this.data = input; // input은 노드의 값을 넣는 매개변수 
			this.next=null;	}
		
		public String toString() {  // 데이터값 출력하여 확인하기 위한 코드 
			return String.valueOf(this.data);	}
	}
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head; // 새로생성된 노드가 다음노드의 헤드값정보를 가져오게 함.  
		head = newNode;   // 새로 생성된 노드가 헤드값을 다시 가지게됨 
		size++; // 데이터가 추가되면서 전체크기가 1 상승
		if(head.next ==null) {tail = head; }
	                                 }
	public void add(int index, Object input) // index번호 자리에 input으로 데이터추가 
     {  	if(index==0) {addFirst(input);}
		else 
	  { Node temp1 = head;
		for( int i =0; i<index-1; i++) {temp1 = temp1.next;	}
		
		Node temp2 = temp1.next; // temp2 는 temp1의next라고 선언 
		Node newNode = new Node(input); // input값을 받은 새로운 newNode 생성 
		temp1.next = newNode; // temp1.next: 앞의노드가 새로생긴 newNode를 가리키게함 
		newNode.next = temp2; // newNode.next: 새로생긴 newNode가 그다음 노드를 가리키게함
		size++;
		if(newNode.next ==null) { tail =newNode;}	
      } 
    }  // 출력을 위한 코드 
    public String toString() {
	if(head == null) { return "[]";}
	Node temp = head;
	String str = "[";
	while(temp.next !=null) 
	{	str+=temp.data+",";
		temp = temp.next;
	}
	str+= temp.data;
	return str+"]";      
 }   
}
	

		


	