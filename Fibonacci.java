import java.util.*;
//exceptions

public class Fibonacci{
	public static void main (String [] args){
		while(true){
		System.out.print("Enter Integer value and press key \"ENTER\" please: ");
		int usernumber=0;
		try {
			Scanner scan = new Scanner(System.in);
			usernumber = scan.nextInt();
		} catch(Exception e){
			System.out.println("OOPS!!! Only INTEGER values must be entered. Try again.");
			break;
		}
		if (usernumber<1){
			System.out.println("Please, input valid number and press key \"ENTER\"");
			} if(usernumber==1){
				System.out.println(usernumber);
				} else {
					int a=1, b=1;
					System.out.println("Fibonacci numbers are: ");
					while(b<usernumber) {
						System.out.println(b);
						b=a+b;
						a=b-a;
					}
				}
		}
}}
/*Самокритика:
rem1 - Идет по всему телу после исключения.
rem2 -
rem3 -
ЗЫ. 3.14-код :). хотя и работает. Доработать по хорошему.
*/