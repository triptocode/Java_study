package arrayExample;

public class Fibonacci {
	
	public void fibo() {
		int[] arr = new int[10];	
		for(int i=0; i < arr.length; i++) {
			if(i <= 1) {
				arr[i] = 1;
			} else {		// i > 2 �� ���
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}		
		for(int value : arr) {    // ����� Ÿ�Ժ��� : �迭 �Ǵ� �÷���
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.fibo();
	}

}