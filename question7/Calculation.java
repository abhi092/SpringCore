package question8;
//In SpEL, we can store a value in the variable and use the variable in the method and call the method. To work on variable, we need to use StandardEvaluationContext class.
public class Calculation {
	private int number;  
	public int getNumber() {  
	    return number;  
	}  
	public void setNumber(int number) {  
	    this.number = number;  
	}  
	public int cube(){  
	    return number*number*number;  
	}  
}  


