package arrayExample;

public class Fibonacci {
	
	public void fibo() {
		int[] arr = new int[10];	
		for(int i=0; i < arr.length; i++) {
			if(i <= 1) {
				arr[i] = 1;
			} else {		// i > 2 인 경우
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}		
		for(int value : arr) {    // 요소의 타입변수 : 배열 또는 컬렉션
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.fibo();
	}

}