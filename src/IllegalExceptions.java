import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalExceptions extends IOException {
       IllegalExceptions(String message){
    	   super(message);
    	   
       }
	static String controlString(String x) throws IllegalExceptions {
		try {
		
			if(x.equals("[^a-zA-Z]")){
				return x;
			}else {
				 throw new IllegalExceptions("fkfkkf");
			}
		}catch(IllegalExceptions e){
			throw new IllegalExceptions("please just input alphatic character");
			//System.out.println(e.getMessage());
		}
	}
	static void controlNum(int y) throws IllegalExceptions {
		try {
		
			if(y>0) {
				
			}
		}catch(Exception e) {
			throw new IllegalExceptions("Dear customer, please just input pozitif numbers ");
		}
	}
	public static void main(String[] args) throws IllegalExceptions {
		Scanner scan=new Scanner(System.in);
		System.out.println("String karakter girini");
		String x=scan.next();
		/*String a="ece123 v&e alpe&%R";
		System.out.println(a.replaceAll("[^a-zA-Z]", ""));
		if(x.equals("[^a-zA-Z]")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}*/
		controlString(x);
		System.out.println(x+1);
	}
	
}
