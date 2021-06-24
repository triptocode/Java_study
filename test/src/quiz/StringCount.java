package quiz;

public class StringCount {
	
	 public static void main(String[] args) 
	   {                             // 첫번째 String:  "xyz" 문자 자체
	String x = new String ("xyz");   //  두번째 String: new String ("xyz")로 생성됨 
	 System.out.println(x);
	String y = "abc";
	 System.out.println(y); // 세번째 String: "abc"
	 x = x+y ;               // 네번째 String: "xyzabc" (x+y로  새로 생성된 x 값)
	 System.out.println(x);
	
       }
}
