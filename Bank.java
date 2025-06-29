import java.util.* ;
public class Bank{  static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		 // JAVA BANKING PROGRAM
		
		 double balance =0 ;
		 boolean isRunning = true;
		 int choice ;
		 while(isRunning) {
			 
			 //DISPLAY MENU
			 System.out.println("BANKING PROGRAM");
			 System.out.println("**********");
			 System.out.println("1= SHOW BALANCE ");
			 System.out.println("2= DEPOSIT");
			 System.out.println("3= WITHDRAW");
			 System.out.println("4= EXIT ");
			 System.out.println("**********"); 
			 
			 System.out.println("ENTER YOUR CHOICE 1-4 \n ");
			 choice = sc.nextInt();
			 switch(choice) {

				case 1 -> showBalance(balance);
				case 2 -> balance += deposit();
				case 3 -> balance -= withdraw(balance);
				case 4 -> isRunning = false ;
				
				default ->  System.out.println("INVALID");

			 }  
			 
		 }
		 
		 System.out.println("THANK U ");
		 
		 
		
		 
		 
		 //GET AND PROVESS USERS CHOICE 
		 //SHOWBALANCE()
		 //DEPOSIT()
		 //WITHDRAW()
		 //EXIT MESSAGE 
		 sc.close();
		
	 }
	 	 static void showBalance(double balance) {
	 		 System.out.printf("INR%.4f\n",balance);}
	 	 
	 	 
	 	 
	 	 
	 	 static double deposit () {
	 		 double amount ;
	 		 System.out.println("enter the amount to be deposit");
	 		 amount = sc.nextDouble();
	 		 
	 		 if (amount<0) {
	 			 System.out.println("NOT NEGATIVE ");
	 		 }
	 		 else {
	 			 System.out.println("CREDITED");
	 			 return amount ;
	 		 	}
	 		 return 0 ;
	 		 }
	 	 
	 	 
	 	 
	 	 static double withdraw (double balance) {
	 		 double amount = 0;
	 		 System.out.println("enter the amount to be withdrawn");
	 		 amount = sc.nextDouble();
	 		 
	 		 if (amount>balance) {
	 			 System.out.println("cant be withdrawn");
	 			 return 0 ;
	 		 }
	 		 else {
	 			 System.out.println("amount is withdrawn");
	 		 } return amount ;
	 	 }	 
	 	 
}
