package basic;

public class Trycatch1_Finally {
	
    public static void main(String[] args) {
    	
     Trycatch1_Finally trycatch1 = new Trycatch1_Finally();
      int c;
      
      try { c = 4 / 0;         // 여기서 ArithmeticException해당되서 catch로 넘어감 
          trycatch1.Catch(); } //이부분 실행안됨 (윗줄에서 catch로  넘어가서 : 한줄지우고 넣고하며 출력 변화 관찰 )
      catch (ArithmeticException e) 
           {c = -1;                      // 변수에 데이터저장만됨 ( 출력은 아직 발생 안된상태)
            trycatch1.Catch();           // 출력 처음 발생  (한줄지우고 넣고하며  출력 변화 관찰 )
            System.out.println(c);       // 출력 두번째 발생  ( c변수에 저장된 -1 데이터 출력)
           } 
        
    finally { trycatch1.Fianlly(3); }
    
    } // main 종료
    
    
	public void Catch() {System.out.println("catch");} // main에서 코드로불러야만 실행
	public void Fianlly(int x) {System.out.println("finally "+x); }
	
}
  
    // [ try-catch-finally 요약] try 블록에서 오류잡아낸줄이후 코드는 실행x 되고 catch블록으로 넘어가서 
    // catch블록부터 finally 블록 코드는 순차적으로 전부 실행된다. 


