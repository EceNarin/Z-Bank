import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public abstract class Customer {
	Scanner scan=new Scanner(System.in);
	ArrayList<Customer> customer=new ArrayList<>();
private static String id;
private String name;
private String Adress;
private String phoneNo;
private String acctNo;
private int creditNo;
private String BankId="112345";
static HashMap<Integer,String> hm=new HashMap<>();
public String getAdress() {
	return Adress;
}
         static HashMap<Integer,String> storageCustomer(){
        	  hm.put(1234567,"Ece");
        	  hm.put(1234569,"Alper<3");
        	  hm.put(1234560,"Ayse");
        	  hm.put(1234556,"Asya");
        	  hm.put(1234557,"Cicek");
        	  hm.put(1234555,"Dilek");
        	  hm.put(1234545,"Cigdem");
        	  hm.put(1234534,"Nergiz");
        	  hm.put(1234554,"Bedirhan");
        	  hm.put(1234539,"Ahmet");
        	  
        	  return hm;
          }
		String createId(String x) {
			String a=getId();
			String id=BankId+ x.substring(x.length()-4);
			return id;
		}
public void setAdress(String adress) {
	//System.out.println("Please enter your valid adress");
	//adress=scan.next();
	Adress = adress;
}
public String getPhoneNo() {
	return phoneNo;
}
public  void setPhoneNo(String phoneNo) {
	//System.out.println("Please enter your valid contact number");
	//phoneNo=scan.next();
	this.phoneNo = phoneNo;
}
public void setId(String b) {
	//System.out.println("please enter your national Id");
	this.id = b;
}
public void setName(String name) {
	//System.out.println("please enter name");
	this.name = name;
}
public void setAcctNo(String acctNo) {
	this.acctNo = acctNo;
}
public String getId() {
	return id;
}
public String getName() {
	return name;
}
public String getAcctNo() {
	return acctNo;
}
					 boolean generalInquiry() {
                      if(Adress!=null&&phoneNo!=null && id!=null && name!=null) {
							System.out.println("All informations are valid");
							return true;
						}else {
							System.out.println("correct ones's deficicies");
							return false;
						}
					}
					private int depositMoney() {
						
						return 2000;
					}
					private int withdrawMoney() {
						return 0;
					}
					abstract void openAccount();
					public abstract void closeAccount();
					
					int applyForLoan() {
						System.out.println("========================\n1 click on 1 for Cash advance \n2 click on Credit options ");
						switch(scan.nextInt()) {
						case 1:
                            int cn=creditNo(); System.out.println(cn);
							if(cn>=10) {
								System.out.println("Dear customer credit limit about 80000$");
								 System.out.println("Are u accept your credit" +"(click: 1 for Yes--- 2 for No)");
						            switch(scan.nextInt()) {
						            case 1:
						            	System.out.println("forwarding u,credit loan system for installment");
						            	return 80000;
									case 2: System.out.println("Thanks to for contacting with us");
						            break;
						            default:
						            	System.out.println("Mistaken click");
						            	break;
						            }	
							}else if(cn<7 || cn>3) {
								System.out.println("Dear customer yours credit limit araound 50000$");
								 System.out.println("Are u accept your credit" +"(click: 1 for Yes--- 2 for No)");
						            switch(scan.nextInt()) {
						            case 1:
						            	System.out.println("forwarding u,credit loan system for installment");
						            	return 50000;
									case 2: System.out.println("Thanks to for contacting with us");
						            break;
						            }	
							}else {
								System.out.println("Dear custumer, unfortunality your credit count not enough for taking credit."
										+ "You can contact out customer services for taking information how to increase your creditNo");
								return 0;
							}
						}return 0;
					}
					
					private int creditNo() {
					  return (int) Math.floor(Math.random()*10+1);
						
					}
					void requestCard() {
						if(creditNo<3) {
							System.out.println("unfortunality your credit circumstances not avaliable for credit card");
						}else {
							if (creditNo>5 ||creditNo<8) {
				System.out.println("Your limit 15000$. In one work day your card wiil arrive on your adress.Please check and confirm your constant adress");
				            }else {
				System.out.println("Your limit 30000$. In one work day your card wiil arrive on your adress.Please check and confirm your constant adress");
							}
						}
						System.out.println("If you want decrease your limit or cancel your card requrest please contact your custumer service");
						
					}
}
