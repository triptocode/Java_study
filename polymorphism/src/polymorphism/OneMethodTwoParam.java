package polymorphism;


public class OneMethodTwoParam {
	
	public static void main(String[] args) {
		classA a = new classA();
		a.methodA(1);                              
		a.methodA("��");                          
		
	} // END main
} // Ŭ���� OneMethodTwoParam ���� 

	
class classA {
		public void methodA (int param) {      //methodA ��� �ϳ��� ���� �޼ҵ��, 
			System.out.println(param);         //  ���Ϻ����� param��
		}                        
		public void methodA (String param) {   // int, String Ÿ�Ը� �ٸ��� �ϰ� 
			System.out.println(param);	       // �����ε��Ͽ� �پ��� �۵������ ������ ��. 
		}	
} // Ŭ����  classA ���� 
	
	
	

