package basic;

public class TryCatch2_WrongException {
	
	public static void main (String[] args) 
    {  // array of size 4.
     int[] arr = new int[4];
     try
        { int i = arr[4];           
            // this statement will never execute
            // as exception is raised by above statement
      System.out.println("no print (by above error, already transferred to catch)");
        }
          
     
     // [ inappropriate Exception: null vs  appropriate: Array ]
     // NullPointerException ����, ������ ������ ���  try���� �����߻��ϰ� ó���Ұ��� ����

//    catch(NullPointerException ex)  
   catch(ArrayIndexOutOfBoundsException ex)
        {System.out.println("Catch block: Exception has been caught");   }
          
        // rest program will not execute
        System.out.println("Outside try-catch clause");
    }

}
