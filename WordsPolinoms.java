import java.io.*;
import java.util.*;

public class WordsPolinoms {
	public static void main(String args[]) {
		String userinput="";
		int result;
		System.out.println("������� �����: ");
		Scanner scan = new Scanner(System.in); // rem1
		//if (scan.hasNextLine()) rem2
		userinput = scan.nextLine();
		StringBuffer buffer = new StringBuffer(userinput); // ������������� ��� �������������� � �������.
		buffer.reverse();
		System.out.println("��� ��� ���� ����� ������� �����-�������: ");
		System.out.println(buffer);
		String reverseinput= new String(buffer.toString());
		reverseinput.toString();
		result = userinput.compareTo(reverseinput); // rem3
		if (result==0) {
		System.out.println("����� ��������� ���� - �������.");
		} else System.out.print("��������� ���� �����- �� �������.");
	}
}
/* �����������:
rem1 - �� �������� �� ��������� ��������.1251
rem2 - �� �������� ������� ���� �� ������ ����. ������� ������� � ��������� ����� � ������ � ����� �������������, ��������� ��������, ����� ������� ������ �����.
rem3 - ������� ���������, �������������, ��������� � ��������� ������. ��������� � �����-�����������.
rem4 - ��������� �� ������ "esc".
��. 3.14(����)-��� :). ���� � ��������. ���������� �� ��������, ��� ��� ���� �� ������ ���.
*/