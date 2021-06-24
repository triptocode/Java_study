package quiz;

public class BitReversal {         // 자바에서는 unsinged int가 존재하지 않는것 같아 비트뒤집는 형식으로 문제를 풀었습니다. 
	
	 public static void main(String[] args) {
	      
	      int num = bitChange(1);
	      
	 
	      for(int i=31; i>=0; i--) {
	          System.out.print( (num>>>i)&1 );
	      }
	  
	   } //END:main 
	   
	   public static int bitChange(int num) {
	      /// 가장 왼쪽 비트에서 출발. 점점 오른쪽으로
	      int p_left=1<<31 ;
	      // 가장 오른쪽 비트에서 출발. 점점 왼쪽으로
	      int p_right=1;
	      for(int i=0; i<16; i++) 
	      {
	          // 두 비트의 상태가 서로 다르면
	          if( ((num&p_left)==0) ^ ((num&p_right)==0) )
	          {
	              num ^= p_left; // 해당 비트 뒤집기(XOR의 성질)
	              num ^= p_right; // 해당 비트 뒤집기(XOR의 성질)
	          }
	       p_left >>>= 1;
	       p_right <<= 1;
	      }
	      
	      return num;      
	      
	

	   }
	   
	}//END:public class


