import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Loan extends Teller{
String accountId,Id,customerId;
 void provideInfo() {
	if(teller.generalInquiry()==true) {
		System.out.println("Valid account");
	}else {
		System.out.println("Please enter your valid informations");
		String str="";
		System.out.println("As first please enter your name");
		String name=scan.next();
		teller.setName(name);
		System.out.println("Enter your constant adress");
		String a=scan.nextLine();
		teller.setAdress(a);
		
		try {
				System.out.println("Please enter your 11 digits id");
				String b=scan.next();
					teller.setId(b);
		}catch(InputMismatchException e){
			System.err.println("Please dont enter NaN input" );
			e.printStackTrace();
		}
		try {
			while(true) {
				System.out.println("Please enter your 10 digits phone number without add head zero");
				String c=scan.next();
				if(c.length()==10) {
					teller.setPhoneNo(c);
					break;
				}else {
					System.out.println("try again");
				}
			
			}
		}catch(InputMismatchException e){
			System.err.println("Please dont enter NaN input" +e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Please check your informs before confirm your informations. Your informations: ");
		str="Adress: " + teller.getAdress()+" IdNo: " +teller.getId()+" Phone Number: "+teller.getPhoneNo();
		System.out.println(str.toUpperCase());
		System.out.println("Dear Customer " + teller.getName().toUpperCase() +" welcome to Java bank family. \n========= Please select your operations.. ");
	}
}
   static  Customer loan=new Loan();
   static Loan l=new Loan();
     public  void creditPay() {
    	int credit= l.applyForLoan();
    	System.out.println("how much your salary amount?");
    	double salary=scan.nextDouble();
    	System.out.println("How many months do u wanna pay? ");
    	int months=scan.nextInt();
    	 double mPay=monthlyPay(months, salary, credit);
    	
    	
     }
     
      private void controlSalary(int months, double salary, double mPay, double a, int credit) {
    	  double payment=credit/months;
    	  double p=credit/months;//ana para
		if(salary-1000>(int)payment) {
			System.out.println("be upproved.Your total payment is: " + mPay );
			for(int i=0;i<months;i++) {
				double pay=payment+(a/10);
				System.out.printf("%2d ---- %4d\n", i+1,(int)pay);
                  // System.out.println(i+1 + "----" + (int)pay);
                   if(a>10) {
                	   a-=a/10;
                   }else {
                	   break;
                   }
			}
		}else {
			System.out.println("your salary amount not approved.");
		}
		
	}

	public double monthlyPay(int months, double salary, int credit) {
    	  int termYears=(int)months/12;
    	  int termMonths=termYears*12;
    	  System.out.println( "Dear customer: " + termYears +" years "+ termMonths + " months ");
    	 double monthlyRate=(months/12)*0.10;
    	 double a=credit*monthlyRate;
    	 double totalPay=(credit*monthlyRate )+credit;
    	 controlSalary(months,salary,totalPay,a,credit);
    			 ///(1-Math.pow(1+monthlyRate,-termMonths));
    	  return totalPay;
      }
    
	public static void main(String[] args) {
		l.creditPay();
	}
}
