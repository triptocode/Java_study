package basic;

public class Trycatch1_Finally {
	
    public static void main(String[] args) {
    	
     Trycatch1_Finally trycatch1 = new Trycatch1_Finally();
      int c;
      
      try { c = 4 / 0;         // ���⼭ ArithmeticException�ش�Ǽ� catch�� �Ѿ 
          trycatch1.Catch(); } //�̺κ� ����ȵ� (���ٿ��� catch��  �Ѿ�� : ��������� �ְ��ϸ� ��� ��ȭ ���� )
      catch (ArithmeticException e) 
           {c = -1;                      // ������ ���������常�� ( ����� ���� �߻� �ȵȻ���)
            trycatch1.Catch();           // ��� ó�� �߻�  (��������� �ְ��ϸ�  ��� ��ȭ ���� )
            System.out.println(c);       // ��� �ι�° �߻�  ( c������ ����� -1 ������ ���)
           } 
        
    finally { trycatch1.Fianlly(3); }
    
    } // main ����
    
    
	public void Catch() {System.out.println("catch");} // main���� �ڵ�κҷ��߸� ����
	public void Fianlly(int x) {System.out.println("finally "+x); }
	
}
  
    // [ try-catch-finally ���] try ��Ͽ��� ������Ƴ������� �ڵ�� ����x �ǰ� catch������� �Ѿ�� 
    // catch��Ϻ��� finally ��� �ڵ�� ���������� ���� ����ȴ�. 


