package quiz;

public class Synchronize {
	
	private Integer counter = new Integer(0);

	 public int increaseAndGet()
   {
      {	 
    	  
     synchronized (counter)  { // synchronized�� counter�� �ƴ� �ٸ� ��ü�� Ŭ������ ����ȭ�� �ؾ� �Ѵ�. 
	  counter +=1;
	  return counter;
                          }
     
      }
   }


}