package arrayExample;


public class WordReversal {             // �� �ΰ��� ������� Ǯ��ý��ϴ�.  ���1 
	
	// Java program to reverse a string
	// s = input()
	
	 
	 public static void main(String[] args)
	    {
	       String s[] = "He has a daughter".split(" "); // " "������ �������� �ش繮���� ������, ��4���� �ܾ�� ���������� �迭�� ����.
	       System.out.println("�迭 0��: "+  s[0]); // he
	       System.out.println("�迭 1��: "+  s[1]); // has 
	       System.out.println("�迭 2��: "+  s[2]); // a 
	       System.out.println("�迭 3��: "+  s[3]); // daughter
	        
	         String blank = "";
	        for (int i = s.length - 1; i >= 0; i--) // �迭 ���� ������  (3,2,1,0 ) �Ͽ� �ܾ� ������ �Ųٷ� ���ش�. 
	        {	blank += s[i] + " "; // 4�� �ܾ� ���̿� ������ �߰��Ͽ� ���� �����ϰ�, �ܾ�� ����
	        }
	        
	        System.out.println("�������� �ܾ� ��ġ �ٲ� ���: "+ blank);
	    }
}