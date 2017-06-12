
public class Exercise13_16 extends Rational{ 
	
	public static void main(String[] args) { 
		
		if (args.length != 1) { 
			System.out.println("Usage: java Exercise13_16 String");
			System.exit(0); 
		}
		
		String result = args[0];
		
		String[] str = args[0].replaceAll(" ", "/").split("/");		
		
		Rational rat1 = new Rational(Integer.parseInt(str[0]), 
				Integer.parseInt(str[1]));
		
		Rational rat2 = new Rational(Integer.parseInt(str[3]), 
				Integer.parseInt(str[4]));
				
		
		switch (str[2].charAt(0)) { 
		case'+': result += " = " + rat1.add(rat2); break;
						  
		case'-': result = " = " + rat1.subtract(rat2); break;
						  
		case'.': result = " = " + rat1.multiply(rat2); break;
		                  
		case'/': result = " = " + rat1.divide(rat2);
		}
		
		System.out.println(result); 
		
	} 
	
}