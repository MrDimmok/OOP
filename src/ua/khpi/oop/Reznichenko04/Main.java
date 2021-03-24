/**
 * 	\author Dmitry Reznichenko
 *
 * ��������:
*�������������� �������� ������ �������� ����������� ������ �3, 
*�������� �� ��������� ������ ����������� ������� ������ ����������� � ������ 
*���������� ����:
*
* *�������� �����;
* *�������� �����;
* *��������� ���������;
* *����������� ����������;
* *���������� �������� � �.�.
*    ����������� ������� ��������� ���������� ����� ��� ���������� ������ ������ ��������:
*
*�������� "-h" �� "-help": ������������ ���������� ��� ������ ��������, ����������� 
*(������������ ��������), ��������� ���� ������ ������ (������ ���� �� ��������� ���������� �����);
*�������� "-d" �� "-debug": � ������ ������ �������� ������������� �������� ���, 
*�� ���������� ������������ �� �������� ������������� ��������: ���������� �����������,
* ������ �������� ������, �������� ���������� ������ �� ��.
 */ 

package ua.khpi.oop.Reznichenko04;

 import java.util.Scanner;


 public class Main { ///�������� �����
	 
	 public static String text=new String("NULL");///����� � ��� ����������� �������� ���� 
	 public static String res=new String("NULL");
     public static Scanner in = new Scanner(System.in);///����� � ��� ����������� ������������� �����

     
	public static void main(final String[] args) {	
			 if(args.length !=0)  Menu(args[0]);/// ������ ������ ����   
    }
	public static void Menu(String operating_mode) ///������� ��������� ������������� �� ����������� �������
	{
	if (operating_mode.equals("-debug")||operating_mode.equals("-d") )
	{	Helper.debug=true;	}
	else if (operating_mode.equals("-help")||operating_mode.equals("-h") ) 
	{ Helper.help=true;}
	
		if (Helper.debug==true)System.out.println("\n("+Helper.date.toString()+") ��������� ������ 'Menu' )");
		
		Helper.Help();
		
		while(true)///����������� ���� ���� �������� ��������� �������
		{
			if (Helper.debug==true)System.out.println("\n("+Helper.date.toString()+")  ������ 'Menu' )");
			if (Helper.debug==true)System.out.println("\n(("+Helper.date.toString()+") text-"+text+"; res-"+res+")");
			System.out.print("\n������ �������: ");
		String  s=in.nextLine();
		
		switch(s)///����� ������� �������
		{
		case "1": Helper.PrintLine(text);
		break;
		case "2": Helper.PrintLine(res);
		break;
		case "3":text=Helper.Replacement(text);
		break;
		case "4": res=Helper.Task6(text);
		break;
		case "5" :Helper.Help();
		break;
	//	case "cls" :              
      //break;
		case "6" :
			text="Eror";
			res="Eror";
		break;
		case "7":
			if (Helper.debug==true)System.out.println("\n(("+Helper.date.toString()+") �������� ������� ������)");
			return;
		default : Helper.Help();
		break;
		}
			
		}
	}

	
}
