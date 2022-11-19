package calculator;

class CalculatorP1 {

	public static void main(String[] args) {}
	

	int a,b, sum,sub;
    double multi,divi, rem;
    
     void sum (int a,int b) {
    	sum= a+b;
    	System.out.println("Sum is : " + sum);
   
    }
    
	
    void sub (int a,int b) {
    	sub = a-b;
    	System.out.println("Subtraction is : " + sub);
    	
    }
    
	 void multi (int a,int b) {
    	multi = a*b;
    	System.out.println("Multiplaction is : " + multi);
    	
    }
    
     void div (int a,int b) {
    	divi = a/b;
    	rem= a%b;
    	
    	System.out.println("Division is : " + divi);
    	System.out.println("Reminder is : " + rem);
    	
    	
    } 
    
}
