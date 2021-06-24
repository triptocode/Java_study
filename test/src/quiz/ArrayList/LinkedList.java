package quiz.ArrayList;

public class LinkedList 
{   private Node head; // ù��° ���
	private Node tail; // ���ϳ� ��带 �˷��ִ� ������ ��� tail 
	private int size = 0; // ��� element�� �����ϴ���

	private class Node
	{	private Object data;
		private Node next;
		
		public Node(Object input) {
			this.data = input; // input�� ����� ���� �ִ� �Ű����� 
			this.next=null;	}
		
		public String toString() {  // �����Ͱ� ����Ͽ� Ȯ���ϱ� ���� �ڵ� 
			return String.valueOf(this.data);	}
	}
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head; // ���λ����� ��尡 ��������� ��尪������ �������� ��.  
		head = newNode;   // ���� ������ ��尡 ��尪�� �ٽ� �����Ե� 
		size++; // �����Ͱ� �߰��Ǹ鼭 ��üũ�Ⱑ 1 ���
		if(head.next ==null) {tail = head; }
	                                 }
	public void add(int index, Object input) // index��ȣ �ڸ��� input���� �������߰� 
     {  	if(index==0) {addFirst(input);}
		else 
	  { Node temp1 = head;
		for( int i =0; i<index-1; i++) {temp1 = temp1.next;	}
		
		Node temp2 = temp1.next; // temp2 �� temp1��next��� ���� 
		Node newNode = new Node(input); // input���� ���� ���ο� newNode ���� 
		temp1.next = newNode; // temp1.next: ���ǳ�尡 ���λ��� newNode�� ����Ű���� 
		newNode.next = temp2; // newNode.next: ���λ��� newNode�� �״��� ��带 ����Ű����
		size++;
		if(newNode.next ==null) { tail =newNode;}	
      } 
    }  // ����� ���� �ڵ� 
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
	

		


	