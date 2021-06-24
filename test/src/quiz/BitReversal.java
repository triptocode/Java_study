package quiz;

public class BitReversal {         // �ڹٿ����� unsinged int�� �������� �ʴ°� ���� ��Ʈ������ �������� ������ Ǯ�����ϴ�. 
	
	 public static void main(String[] args) {
	      
	      int num = bitChange(1);
	      
	 
	      for(int i=31; i>=0; i--) {
	          System.out.print( (num>>>i)&1 );
	      }
	  
	   } //END:main 
	   
	   public static int bitChange(int num) {
	      /// ���� ���� ��Ʈ���� ���. ���� ����������
	      int p_left=1<<31 ;
	      // ���� ������ ��Ʈ���� ���. ���� ��������
	      int p_right=1;
	      for(int i=0; i<16; i++) 
	      {
	          // �� ��Ʈ�� ���°� ���� �ٸ���
	          if( ((num&p_left)==0) ^ ((num&p_right)==0) )
	          {
	              num ^= p_left; // �ش� ��Ʈ ������(XOR�� ����)
	              num ^= p_right; // �ش� ��Ʈ ������(XOR�� ����)
	          }
	       p_left >>>= 1;
	       p_right <<= 1;
	      }
	      
	      return num;      
	      
	

	   }
	   
	}//END:public class


