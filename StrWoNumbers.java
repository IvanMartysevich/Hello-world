import java.util.Scanner;

public class StrWoNumbers {
	public static void main(String [] args){
		String userinput ="";
		System.out.println("Enter different text with numbers and press \"ENTER\": "); 
		Scanner scan = new Scanner(System.in); // rem1
		//if (scan.hasNextLine()) - rem2 
		userinput = scan.nextLine();
		//userinput = userinput.toString();
		userinput = userinput.replaceAll("\\d","");
		System.out.println("This is Your text without numbers: ");
		System.out.println(userinput);
	}
}
/*Самокритика:
rem1 - не помешала бы поддержка кирилицы.1251
rem2 - По хорошему пустого поля не должно быть. Убирать каретку и добавлять текст к тексту и потом распечатывать, исключать ситуации, когда введены только цифры.
rem3 - Загнать получение ввода от пользователя и его обработку в методы. Перенести в класс-конструктор.
PS - 3.14-code.
*/