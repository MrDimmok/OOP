package ua.khpi.oop.Reznichenko05; 

/**
 * \brief L5
 * 	\author Dmytry Reznihenko
 * 
 * ��������:
 *������ �����. � ������ �������� �� �������, ��� ��������, �� �� � �������.
 * ��������, �� ������������, ������� �� �������. ̳� �������������� ����,
 *  �� ����������� ������� �����, �������� ���� � ���� ������� ("a,b,c" -> "a, b, c").
 *   ������� ���������� ����� �� ���������.
 */ 
 import java.util.Scanner;
 
 public class Main {
	 
	public static Scanner in = new Scanner(System.in);
	public static void main(final String[] args) {
    	 
		System.out.print("������ ��� �����: ");
		Container s=new Container();
		String s2=new String(in.nextLine());
		s.add(s2);
		Iterator<String> iterator=s.iterator(); 

		 Helper.PrintLine(s.toString());///����� ������
		s=Helper.Task6(s);///������� ��������

		 
		Helper.PrintNewLine(s.toString());///;����� �������������� �����
		System.out.print("\n����� ����� i�������(while):");
        while (iterator.hasNext())
       {
   	    System.out.print(iterator.next().toString());
       }

    }
}
