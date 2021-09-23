package polymorphism;

public class CalculaotrMain {
	
	  public static void main(String[] args) { 	  
		  // 하나의 클래스 Calculator가 CalculatorPlus 와 CalculatorMinus 등 다양한 작동방식을 가지게한다. 
	        Calculator plus = new CalculatorPlus();
	        plus.number(20, 10);	         
	        Calculator minus = new CalculatorMinus();
	        minus.number(20, 10);         
	        execute(plus);
	        execute(minus);
	    }
	  
	   public static void execute (Calculator cal){
	        System.out.println("실행결과");
	        cal.run();
	    }
	  
}  
	
abstract class Calculator{
	    int num1, num2;
	    public void number (int num1, int num2){
	    this.num1 = num1; this.num2 = num2;
	    } 
	    int plus () { return this.num1 + this.num2; }
	    int minus () { return this.num1 - this.num2; }
	    public abstract void sum();  
	    public abstract void avg();
	    
	    public void run(){ sum(); avg();}
	}
class CalculatorPlus extends Calculator {
	    public void sum(){
	        System.out.println("plus :"+plus());
	    }
	    public void avg(){
	        System.out.println("+ avg :"+(this.num1+this.num2)/2);
	    }
	} 
class CalculatorMinus extends Calculator {
	    public void sum(){
	        System.out.println("minus :"+minus());
	    }
	    public void avg(){
	        System.out.println("- avg :"+(this.num1-this.num2)/2); // 
	    }
	} 
	
	
