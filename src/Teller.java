import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Teller extends Customer {
	static Scanner scan=new Scanner(System.in);
	static Customer teller=new Teller();
    static Loan ln=new Loan();
    static ArrayList<String> newCustomer=new ArrayList<>();
    @Override
	void openAccount() {
		if(teller.generalInquiry()==true) {
			System.out.println("Opening account is successful");
		}else {
			System.out.println("You have to complete your information then contact with us for openning account ");
			ln.provideInfo();
		}
	}
 
	@Override
	public void closeAccount() {
		System.out.println("Are u want to close your account" +"(1 for yes/ 2 for No)");
		switch(scan.nextInt()) {
		case 1:
			System.out.println("I'm forwading to you voice response unit");
			voiceResponse();
			break;
		case 2:
			System.out.println("I'm forwading you main menu");
			break;
		}
	}
	private void voiceResponse() {
		System.out.println("Are you sure for close your account. Please type your phone pushes 'Yes'");
		String close=scan.next().toUpperCase();
		for(int i=3;i>0;i--) {
			if(close.contains("YES")) {
				System.out.println("your account will close in two days, if want to delay your request please contact with us via 444-5-444");
				break;
			}else {
				System.out.println("Mismatch choice please try again");
			}
		}
	}

	void collectMoney() {
		
	}
	 static void loanRequest() {
	    System.out.println("How much do u need credit?");
		int loan=scan.nextInt();
		System.out.println("please let me check before your credit limit situation");
		teller.applyForLoan();
		}
	void provideInfo(){
		for(int i=0;i<3;i++) {
			if(teller.getName().toUpperCase()==scan.next().toUpperCase()) {
				System.out.println("Dear " + teller.getName().toUpperCase() +"Welcome to bank online system");
				break;
			}else {
				System.out.println("please try again");
				continue;
			}
		}
		System.out.println("Please conctact with customer cervice or try again later");
		
		
	}
	void IssueCard(){
		teller.requestCard();
	} 
				public static void main(String[] args) {
					//teller.openAccount();
					Teller.loanRequest();
					//teller.closeAccount();
			
				}
}
