import java.io.*;
import java.util.*;

public class WordsPolinoms {
	public static void main(String args[]) {
		String userinput="";
		int result;
		System.out.println("Введите слово: ");
		Scanner scan = new Scanner(System.in); // rem1
		//if (scan.hasNextLine()) rem2
		userinput = scan.nextLine();
		StringBuffer buffer = new StringBuffer(userinput); // воспользуемся для преобразования в полином.
		buffer.reverse();
		System.out.println("Вот так Ваше слово пишется задом-наперед: ");
		System.out.println(buffer);
		String reverseinput= new String(buffer.toString());
		reverseinput.toString();
		result = userinput.compareTo(reverseinput); // rem3
		if (result==0) {
		System.out.println("Слово введенное Вами - полином.");
		} else System.out.print("Введенное Вами слово- не полином.");
	}
}
/* Самокритика:
rem1 - не помешала бы поддержка кирилицы.1251
rem2 - По хорошему пустого поля не должно быть. Убирать каретку и добавлять текст к тексту и потом распечатывать, исключать ситуации, когда введены только цифры.
rem3 - Вынести получение, реверсивность, сравнение в сторонние методы. Перенести в класс-конструктор.
rem4 - Зациклить до набора "esc".
ЗЫ. 3.14(пиип)-код :). хотя и работает. Пеработать по хорошему, ибо сей опус не совсем ООП.
*/