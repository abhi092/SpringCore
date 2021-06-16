package question8;
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  

public class Test1 {
	
	//Operators in SPEL
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  
		  
		//arithmetic operator  
		System.out.println(parser.parseExpression("'Welcome Abhi'+'!'").getValue());  
		System.out.println(parser.parseExpression("15 * 15/2").getValue());  
		System.out.println(parser.parseExpression("'Date Is: '+ new java.util.Date()").getValue()); //get date and today 
		  
		//logical operator  
		System.out.println(parser.parseExpression("true and true").getValue());  
		System.out.println(parser.parseExpression("true and false").getValue());   
		//Relational operator  
		System.out.println(parser.parseExpression("'kalua'.length()==5").getValue());  
		}
}  
	


