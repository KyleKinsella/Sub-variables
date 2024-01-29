package learningTesting.learningTesting;

import java.lang.reflect.Method;
import java.util.Random;


public class App {

	
//	public static int randomizer() {
//		Random rand = new Random(); 
//		Random rand2 = new Random();
//
//		
//		
//		int randomNum1 = rand.nextInt(100); 
//		int randomNum2 = rand2.nextInt(100);
//		
//		
//		System.out.println(randomNum1);
//		System.out.println(randomNum2);
//		
//	    
//		int result = randomNum1 + randomNum2;
//		
//		
//		return result;
//	}
//
//	
	
//	public static Object obj(Object num1, Object num2) {
//		return num1;
//	}
	
	
//	
//	public static int sub(int num1, int num2) {
//		return num1 - num2;
//	}
	
	
//	public static int rand() {
//		return (int) (Math.random() * 100);
//	}



	public interface test {
	    void performOperation(String a, Class<?> b, int c);
	}
	
	
	
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
//	private static void errorInAdd(int result) {
//		assert result < 5 : "error in add()";
//	}
	
	/// get the types of the parameters
	
    public static void main( String[] args ) throws NoSuchMethodException {
    	
    	Method method;
        try {
            method = App.class.getMethod("add", int.class, int.class);
            
            Class<?> rtnType = method.getReturnType();
            
            if(rtnType == int.class) {
            	
            	System.out.println("The Return Type is: " + rtnType);  
            	
            }
            else {
            	System.out.println("No Return Type Found ..... ");
            }
            
            String name = method.getName();
            Class <?> type = method.getReturnType();
            int para = method.getParameterCount();


            
//            int result = App.add(1, 99);
//            
//            if (result == 10) {
//            	
//	            errorInAdd(result);
//	            System.out.println("Test Passed");
//            
//            }
//            else {
//            	 System.out.println("Test Failed !");
//            }
            	
            
            test k = new test() {
            	@Override
            	public void performOperation(String name, Class<?> type, int para) {
            		
            		System.out.println("Name: " + name);
            		System.out.println("Type: " + type);
            		System.out.println("Para: " + para);
            	}
            };
          
            	
            k.performOperation(name, type, para);
            
            
//            @Test
//            public static type name(para) {
//            	return type;
//            }
            
           
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }   
    }	
}
