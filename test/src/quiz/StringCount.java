package quiz;

public class StringCount {
	
	 public static void main(String[] args) 
	   {                             // ù��° String:  "xyz" ���� ��ü
	String x = new String ("xyz");   //  �ι�° String: new String ("xyz")�� ������ 
	 System.out.println(x);
	String y = "abc";
	 System.out.println(y); // ����° String: "abc"
	 x = x+y ;               // �׹�° String: "xyzabc" (x+y��  ���� ������ x ��)
	 System.out.println(x);
	
       }
}
