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
/*�����������:
rem1 - �� �������� �� ��������� ��������.1251
rem2 - �� �������� ������� ���� �� ������ ����. ������� ������� � ��������� ����� � ������ � ����� �������������, ��������� ��������, ����� ������� ������ �����.
rem3 - ������� ��������� ����� �� ������������ � ��� ��������� � ������. ��������� � �����-�����������.
PS - 3.14-code.
*/