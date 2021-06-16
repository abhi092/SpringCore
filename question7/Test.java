package question8;
import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
  
public class Test {  
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser(); 
		//using concat
		//Expression exp = parser.parseExpression("'Welcome Abhi'.concat('!')");  
		//Expression exp = parser.parseExpression("'SpringExperessionLanguage'");  
		//String message = (String) exp.getValue();  
		//System.out.println(message);  
//OR  
//System.out.println(parser.parseExpression("'Hello SPEL'").getValue());  
		//converting string into byte array
//		Expression exp = parser.parseExpression("'Hello World'.bytes");  
//		byte[] bytes = (byte[]) exp.getValue();  
//		for(int i=0;i<bytes.length;i++)
//		 {  
//		    System.out.print(bytes[i]+" ");  
//		
//
//	     }
		//getting length of the string
//		Expression exp = parser.parseExpression("'Hello World'.bytes.length");  
//		int length = (Integer) exp.getValue();  
//		System.out.println(length);  
	    //converting string content to upercase
		Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");  
		String message = exp.getValue(String.class);  
		System.out.println(message);  
		//OR  
		System.out.println(parser.parseExpression("'hello world'.toUpperCase()").getValue());  
	}  
}
	