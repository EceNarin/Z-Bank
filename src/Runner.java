import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
	static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
    	Teller teller=new Teller();
    	Loan loan=new Loan();
    	System.out.println("\n====" + Greeting.getTimeFromSystem().toUpperCase() + " Dear Customer! ==== ");
		System.out.println("Login with Id ");
	      try {
				int a=scan.nextInt();
				String value=Customer.storageCustomer().getOrDefault(a,"Sorry that, there is no any Id like that... ");
				System.out.println("Welcome dear custuomer  "+value.toUpperCase());
				if(Customer.storageCustomer().get(a)==null) {
					System.out.println("Do you wanna open account our system. (1 for YES /2 for NO) ");
				}
		}catch(InputMismatchException e) {
			System.out.println("Please input diggits character");
		}
	          System.out.println("Please select your operations");
	          Greeting.mainMenu();
	          int select=scan.nextInt();
				switch(select) {
				case 1:
					teller.openAccount();
					break;
				case 2:
					teller.applyForLoan();
					break;
				case 3:
					loan.creditPay();
					break;
				case 4:
					teller.requestCard();
					break;
				case 5:
					System.out.println("Thanks for visit... ");
				default:
					System.out.println("mistaken click.. ");
				}
	          
	}
}
