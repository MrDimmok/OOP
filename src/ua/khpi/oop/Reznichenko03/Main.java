package ua.khpi.oop.Reznichenko03;

/**
 * 	\author Dmitry Reznichenko
 */ 

 import java.util.Scanner;
 
 public class Main {
	 public static Scanner in = new Scanner(System.in);
	 	public static void main(final String[] args) {
    	 
					 
			StringBuilder s = new StringBuilder();
			s= Helper.AddTextSB();///���� �����
			Helper.PrintLineSB(s);///����� ������
			s=Helper.Task6(s);///������� ��������
			Helper.PrintNewLine(s);///;����� �������������� �����
    }
}
