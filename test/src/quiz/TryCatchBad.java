package quiz;

public class TryCatchBad {

	public static void main(String[] args) 
	   {
		try 
		{ badMethod();             // ����1. ������ badMethod���� ���ܸ� ������  
		System.out.println("A");
		}
		catch (Exception ex)       //2. catch���� �ɷ��� �ش� �� ���� ���
		{  System.out.println("B");
		}
		finally                     //3.  finally�� ���������� c�� ��� 
		{System.out.println("C");
		}
		System.out.println("D");    // 4. try-catch-finally ������ D��� ���� ( �ᱹ b, c, d ���)
	   }
public static void badMethod() {
	throw new RuntimeException ();   // ����1. ������ badMethod���� ���ܸ� ������ 
    }
}
