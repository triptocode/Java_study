package arrayExample;
import java.util.Arrays;
import java.util.Scanner;

public class Draw {	
	
	static int slots;
	public static void main(String[] args) {
		
		Draw draw = new Draw();
		
		Scanner drawScanner = new Scanner(System.in);
		System.out.print("추첨하고싶은  자릿수 입력 : ");
         slots =drawScanner.nextInt();
      	System.out.print(" 추첨하고 싶은 명수 입력: ");
    	  int totalPerson = drawScanner.nextInt();
    	  drawScanner.close();
		
		System.out.println( "총 "+totalPerson+"명 추첨 시작 !!");
		for(int winnerRank=totalPerson; winnerRank>=1;winnerRank--) {
		System.out.println(winnerRank+"등: "+ lottoNumbers());  	
		}
	}
		static String lottoNumbers() {
			
			int []lotteryArr=new int[slots]; 
			for(int slotNum=0; slotNum<slots;slotNum++) {
				lotteryArr[slotNum]=(int)(Math.random()*45+1);	
				}	
			return Arrays.toString(lotteryArr);
		}
}

