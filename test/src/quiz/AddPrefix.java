package quiz;

public class AddPrefix 
{
	public static void main(String[] args) {
		String input, result;
		
		input ="abc";
		result=addPrefix( input ) ;
	    System.out.println( result );
	    
	    input =null;
	    result=addPrefix( input ) ;
	    System.out.println( result );
	   
	    input ="";
	    result=addPrefix( input ) ;
	    System.out.println( result );
	   
	    input = new String ("");                         // �����߻�: new String ("")��  return str ���� ""���� ������ �ʰ� "prefix-"  �� ��µȴ�. 
	    result=addPrefix( input ) ;
	    System.out.println( result );    	} 

	public static String addPrefix( String str) {
		if (str!=null && str!="") { // ���������ڵ�:  str!=""�� ������ ���, �ּҰ� �񱳿����ڷ� ���ڳ��� ��ü�� ���� �񱳰� �Ұ� �ϴ�. 
			return "prefix-"+str;	} //�ذ���: ���밪 ��ü�� ���Ҽ��ְ� str!="" --> !str.equals("")�� ������ ���� �ڵ带 �����Ѵ�. if (str !=null && !str.equals("")) {
		return str;                          	}	
 }
