import java.util.ArrayList;
import java.util.Scanner;

public class TestPrimeNumbers {
	public static void main(String [] args) {
		PrimeNumbers myPrimeNumbers = new PrimeNumbers();
		System.out.print("Enter INTEGER value greater than 1: "); // Введите, пожалуйста, целое положительное число больше 1
		myPrimeNumbers.setNumber(); // ввод числа пользователем
		myPrimeNumbers.getPrimeNumbers(); //
		System.out.println("Prime numbers for the value you entered are: "); // Простые числа:
		myPrimeNumbers.show() ;
	}
}

class PrimeNumbers {
	private int usernumber; //число введенное пользователем
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	//проверка числа на соответствие простому
	private boolean PrimeNumbers(int num) {
		boolean flag = true;
		for (int j = 2; j < num; j++) {/* Простое число - это целое натуральное (положительные)
			число БОЛЬШЕ 1, которые имеют ровно 2 натуральных делителя (только 1 и самого себя)
			,т.е делится без остатка на 1 и само себя. */
			if (num % j == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	//получение числа от пользователя
	public void setNumber() {
		try {Scanner scan = new Scanner(System.in);
		if (scan.hasNextInt()) usernumber = scan.nextInt();
		scan.close();
		}
		catch(Exception e){System.out.println("Only INTEGER values greater than 1 must be entered. Try again.");
		} // Доработать перехват исключений.
	}

	//получение всех простых чисел в массив или вывод предупреждения о неправильном пользовательском вводе.
	public void getPrimeNumbers() {
		if (usernumber < 1) {
			System.out.println("Your number must be equal or greater than 1!"); // Согласно условия задания число должно быть от!!! 1 (включая или нет не сказано) до N.
			}
			else {
				for (int i = 1; i <= usernumber; i++) {
					if (PrimeNumbers(i)) {
						numbers.add(i);
					}
				}
			}
	}

	//вывод
	public void show() {
		System.out.println(numbers);
	}
}
/*Самокритика:
rem1 - Получше, но все равно 3,14. Исключения....:(
rem2 - cp1251? windows-1251? koi-8r?
rem3 - 3.14

*/