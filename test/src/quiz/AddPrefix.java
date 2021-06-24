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
	   
	    input = new String ("");                         // 에러발생: new String ("")은  return str 값인 ""으로 나오지 않고 "prefix-"  로 출력된다. 
	    result=addPrefix( input ) ;
	    System.out.println( result );    	} 

	public static String addPrefix( String str) {
		if (str!=null && str!="") { // 에러원인코드:  str!=""로 설정할 경우, 주소값 비교연산자로 문자내용 자체에 대한 비교가 불가 하다. 
			return "prefix-"+str;	} //해결방법: 내용값 자체를 비교할수있게 str!="" --> !str.equals("")로 변경한 우측 코드를 적용한다. if (str !=null && !str.equals("")) {
		return str;                          	}	
 }
