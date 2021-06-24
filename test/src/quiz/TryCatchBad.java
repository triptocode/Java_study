package quiz;

public class TryCatchBad {

	public static void main(String[] args) 
	   {
		try 
		{ badMethod();             // 순서1. 강제로 badMethod에서 예외를 던져서  
		System.out.println("A");
		}
		catch (Exception ex)       //2. catch에서 걸려서 해당 블럭 내용 찍고
		{  System.out.println("B");
		}
		finally                     //3.  finally는 마지막으로 c를 찍고 
		{System.out.println("C");
		}
		System.out.println("D");    // 4. try-catch-finally 끝나고 D찍는 구조 ( 결국 b, c, d 출력)
	   }
public static void badMethod() {
	throw new RuntimeException ();   // 순서1. 강제로 badMethod에서 예외를 던져서 
    }
}
