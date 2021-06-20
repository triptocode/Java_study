package basic;

public class MethodReturn {
	
	
//	   Method = 클래스가 가지는 기능  
//
//			입력값: 매개변수, 인자 
//          결과값: 리턴값
	
//			매개변수 parameter :  전달된 인자를 받아들이는 변수
//			인자 Argument: 어떤 함수를 호출시에 전달되는 값

	// public  리턴타입             메소드명 ( 매개변수) { 구현 }
		public  void    method1 (            ) {        }
		public  void    method2 (   int  x  ) {  System.out.println( x +"변수와 문자  ");       }
		public  void    method3 (            ) { System.out.println( "문자");       }
	    public  void    method4 (   int a, int b  ) { System.out.println( a+b);  } 
	    
 	    
	    public  int     method5 (   int x  ) { System.out.print( "변수값: "+x);  return 10 *x; }
	    
	    public String method6 (String nick) 
	    {   
	    	
	     if ("fool".equals(nick)) 
	    	 
	    	 // fool 과 일치하면 아래 출력  및 return 으로 fool+"1"값이 nick에 저장되며 메소드종료. 
	     { System.out.println("fool o 조건과 일치: "+nick+" "); return nick +"+1";  }
	       
	   // fool 과 불일치하면 if{}벗어나 아랫줄에 두줄 진행됨.
	     System.out.println(" fool x,  불일치 단어: "+nick);
	     return nick+"+2";  // 두번째 리턴된 값은 MethodMAin 클래스에서 출력 
	       
	       
	        
	   }			    		
}
			   

		
		
	   
			   

