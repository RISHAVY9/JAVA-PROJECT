import java.util.* ;
public class Slotmachine{
	public static void main (String args[]) {
		
		//JAVA SLOT MACHINE 
		Scanner sc = new Scanner(System.in);
		
		// DECLARE VARAIBLES
		
		int balance = 1000;
		int bet ;
		int payout ;
		String[] row ;
		String playAgain ;
		
		
		//WELCOME MESSAGE
		System.out.println("************************");
		System.out.println("WELCOME TO JAVA SLOT \n");
		System.out.println("Symbols:🐎🐏🦍🐪🐘 ");
		System.out.println("************************");
		
		//PLAY IF BALANCE > 0
		while(balance>0) {
			System.out.println("CURRENT BALANCE=" + balance );
			System.out.print("PLACE YOUR BET AMOUNT=");
			bet = sc.nextInt();
			sc.nextLine();
			//ENTER BET AMOUNT 
			// VERIFY IF BET >BALANCE
			if (bet>balance) {
				System.out.println("insufficient balance");
				continue ;
			}
			//VERIFY IF BET >0
			else if (bet <= 0) {
				System.out.println("INVALID AMOUNT ");
				continue;
			}
			
			// MINUS BET FROM BALANCE 
			
			else {
				balance -= bet ;
			
			}
			
			//SPIN ROW 
			
			System.out.println("SPINNING .....");
			row = spinRow();
			printRow(row);
			payout = getPayout(row , bet);
			if(payout >0) {
				System.out.println("YOU WON " + payout);
				balance +=payout ;
			}
			else {
				System.out.println("YOU LOST");
			}
			System.out.println("DO YOU WANT TO PLAY AGAIN ? (YES=Y | NO =N)");
			playAgain = sc.nextLine().toUpperCase();
			
			if (!playAgain.equals("Y")) {
				break ;
			}
		}
		
		System.out.println("GAME OVER | YOUR FINAL BALANCE IS = " + balance ) ;
		sc.close();
		
	}
	
	private static void printRow(String[] row) {
		// TODO Auto-generated method stub
		
	}

	static String[] spinRow() {
		 String[] symbols = {"🐎","🐏","🦍","🐪","🐘"} ;
		 String[] row = new String [3];
		 Random random = new Random ();
		 for (int i = 0 ; i <3 ; i++) { 
		 row[i]= symbols[random.nextInt(symbols.length)];
		 }
		
		
		 return row ;
		
		
		
		
	}
	
	static int getPayout (String[] row , int bet ) {
		if (row[0].equals(row[1]) && row[1].equals(row[2])) {
			
			return switch (row[0]) {
			case "🐎" -> bet * 3 ;
			case "🐏" -> bet * 4 ;
			case "🦍" -> bet * 5 ;
			case "🐪" -> bet * 6 ;
			case "🐘" -> bet * 10 ;
			default -> 0 ;
			};
		}
		else if 
			(row[0].equals(row[1])) {
				
				return switch (row[0]) {
				case "🐎" -> bet * 3 ;
				case "🐏" -> bet * 4 ;
				case "🦍" -> bet * 5 ;
				case "🐪" -> bet * 6 ;
				case "🐘" -> bet * 10 ;
				default -> 0 ;
				};
		}
		
		else if ( row[1].equals(row[2])) {
			
			return switch (row[1]) {
			case "🐎" -> bet * 3 ;
			case "🐏" -> bet * 4 ;
			case "🦍" -> bet * 5 ;
			case "🐪" -> bet * 6 ;
			case "🐘" -> bet * 10 ;
			default ->0 ;
			
			};
		
	}
	 return 0 ;
	
}
	}