package quiz;

public class Factorial {

   public static void main(String[] args) 
   {
		int input = 3;       // 3!
		System.out.println(f(input)); // 맨처음은 main에서 f(3) 메소드가 실행     
	}

	public static int f(int n) { // fact(3)에서 n은 현재 3으로 1보다 커서,  

		if (n <= 1)
			return n;
		else 
			return f(n-1) * n;   // else를 타고 fact(2)가 호출된다. 
		                        // 처음 호출된 fact(4)는 종료되지 않고 Stack에 쌓인상태고, fact(3)이 실행되며 1이 될때까지 반복된다. 

                                 	}
}