
package quiz;

public class Factorial {

   public static void main(String[] args) 
   {
		int input = 3;       // 3!
		System.out.println(f(input)); // ��ó���� main���� f(3) �޼ҵ尡 ����     
	}

	public static int f(int n) { // fact(3)���� n�� ���� 3���� 1���� Ŀ��,  

		if (n <= 1)
			return n;
		else 
			return f(n-1) * n;   // else�� Ÿ�� fact(2)�� ȣ��ȴ�. 
		                        // ó�� ȣ��� fact(4)�� ������� �ʰ� Stack�� ���λ��°�, fact(3)�� ����Ǹ� 1�� �ɶ����� �ݺ��ȴ�. 

                                 	}
}


