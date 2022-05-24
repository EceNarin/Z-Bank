import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Greeting { 

	public static String getTimeFromSystem() {
		Teller teller=new Teller();
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        int hours = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);

        if(6<hours&&hours<=12){       
            return "Good Morning";
        }else if(12<hours && hours<=16){        
            return "Good Afternoon";        
        }else if(16<hours&&hours<=21){         
            return "Good Evening";        
        }else {
            return "Good Night";
        }              
    }
	public static void goStop(int x) {
		System.out.println("Do u wanna continue or nor (1 for continue/ 2 for exit)");
		while(true) {
			if(x==1) {
				continue;
			}else if(x==2) {
				break;
			}else {
				System.out.println("Forwading you main menu ");
				continue;
			}
		}
		
	}
	public static void  mainMenu() {
		
		//System.out.println(getTimeFromSystem());
		//Scanner scan = new Scanner(System.in);
		char l = 166;
		
		System.out.println("+-------------------------+");
		System.out.println(l+"    JAVA BANK            "+l);
		System.out.println("+-------------------------+");
		System.out.println(l+" 1  OPEN ACCOUNT         "+l);
		System.out.println(l+" 2  CLOSE ACCOUNT        "+l);
		System.out.println(l+" 3  LOAN REQUEST         "+l);
		System.out.println(l+" 4  CREDIT CARD REQUEST  "+l);
		System.out.println("+-------------------------+");
		
		
		
	}
	public static void main(String[] args) {
		Greeting obj=new Greeting();
		obj.getTimeFromSystem();
		System.out.println(obj.getTimeFromSystem());
		obj.mainMenu();
	}
	/**
	 * main() {
  int hourValue = DateTime.now().hour;
  print(checkDayPeriod(hourValue));
}

String checkDayPeriod(int hour) {
  int _res = 21;
  Map<int, String> dayPeriods = {
    0: 'Good night',
    12: 'Good morning',
    16: 'Good afternoon',
    21: 'Good evening',
  };

  dayPeriods.forEach(
    (key, value) {
      if (hour < key && key <= _res) _res = key;
    },
  );

  return dayPeriods[_res];
}
	
	 * 
	 * 
	 */
}