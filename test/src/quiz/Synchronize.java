package quiz;

public class Synchronize {
	
	private Integer counter = new Integer(0);

	 public int increaseAndGet()
   {
      {	 
    	  
     synchronized (counter)  { // synchronized를 counter가 아닌 다른 객체나 클래스에 동기화를 해야 한다. 
	  counter +=1;
	  return counter;
                          }
     
      }
   }


}