package basic;

public class MethodReturn {
	
	
//	   Method = Ŭ������ ������ ���  
//
//			�Է°�: �Ű�����, ���� 
//          �����: ���ϰ�
	
//			�Ű����� parameter :  ���޵� ���ڸ� �޾Ƶ��̴� ����
//			���� Argument: � �Լ��� ȣ��ÿ� ���޵Ǵ� ��

	// public  ����Ÿ��             �޼ҵ�� ( �Ű�����) { ���� }
		public  void    method1 (            ) {        }
		public  void    method2 (   int  x  ) {  System.out.println( x +"������ ����  ");       }
		public  void    method3 (            ) { System.out.println( "����");       }
	    public  void    method4 (   int a, int b  ) { System.out.println( a+b);  } 
	    
 	    
	    public  int     method5 (   int x  ) { System.out.print( "������: "+x);  return 10 *x; }
	    
	    public String method6 (String nick) 
	    {   
	    	
	     if ("fool".equals(nick)) 
	    	 
	    	 // fool �� ��ġ�ϸ� �Ʒ� ���  �� return ���� fool+"1"���� nick�� ����Ǹ� �޼ҵ�����. 
	     { System.out.println("fool o ���ǰ� ��ġ: "+nick+" "); return nick +"+1";  }
	       
	   // fool �� ����ġ�ϸ� if{}��� �Ʒ��ٿ� ���� �����.
	     System.out.println(" fool x,  ����ġ �ܾ�: "+nick);
	     return nick+"+2";  // �ι�° ���ϵ� ���� MethodMAin Ŭ�������� ��� 
	       
	       
	        
	   }			    		
}
			   

		
		
	   
			   

