import java.util.*;
public class PRIME{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number = ");
        int a = sc.nextInt();
        
        	for ( int i=2 ; i<=a-1 ; i++) {
        		if (a%i==0) {
        			System.out.println("PRIME not");
        			break;
        					}
        		
        		else {
        			System.out.println("PRIME ");
        			break;
        			}
        		
        	}
        }
    }

 