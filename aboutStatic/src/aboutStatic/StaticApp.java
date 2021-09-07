package aboutStatic;

class C {
        public static String classVar = "classVar (= static variable )";  // Ŭ���� C1�� ���� ����ƽ ���� classVar ���� (����)
        public String instanceVar = "instanceVar";  //Ŭ���� C1��  ���� �ν��Ͻ� ���� instanceVar ���� (����)	    
        public static void classMethod()  {
        	System.out.println("classMethod: "+classVar);   }  // OK     static Ŭ�����żҵ�� static������ ok 
    //    	System.out.println("classMethod: "+instanceVar);}  // error
        public void instanceMethod() { 
        	System.out.println("instanceMethod: "+classVar);  // OK �ν��Ͻ��޼ҵ忡���� static������ instance ������� ok
        	System.out.println("instanceMethod: "+instanceVar); }   // OK 
        }

public class StaticApp {
	
		public static void main(String[] args) {
   System.out.println(C.classVar); // OK    �ٸ�Ŭ������ ���� �� ���� static=Ŭ���� ������ ���ٰ��� 
// System.out.println(C.instanceVar); // Error   �ٸ�Ŭ������ ���� �� ���� �ν��Ͻ����� ���ٺҰ�
	
   C.classMethod();       // OK 
// C.instanceMethod();    // Error
	
   C c1 = new C(); // instance c1: Ŭ����C�ȿ� static������ static�޼���� ����ǰ� ������ʸ� ���԰� ����ÿ��� C��c1,c2 ���  ������ �ְ�޴´�. 
   C c2 = new C(); // instance c1: Ŭ����C�ȿ� �ν��Ͻ������� �ν��Ͻ��޼���� ���İ� �� �Ѵ� ������ ������ �������. ���� �ϳ� ����� ���� ����x 

   System.out.println(c1.classVar);
   System.out.println(c1.instanceVar);
   
   c1.classVar = "c1.classVar - new input: �ν��Ͻ�c1 �� ����� ����� �ٸ�Ŭ����C��  �ν��Ͻ�c2 ���԰��� ��� ����ȴ�.";
   System.out.println("C.classVar: "+ C.classVar);
   System.out.println("c2.classVar: "+ c2.classVar);
   
   c1.instanceVar = "in c1.instanceVar, new input : not linked to C and C2";
// System.out.println(C.instanceVar); // error
   System.out.println(c1.instanceVar);
   System.out.println("c2.instanceVar: "+c2.instanceVar); // / C�� �ν��Ͻ������� ������ ������ ����� c2�� �̺������� ó�� C���ν��Ͻ��� ���
	        }
	}
