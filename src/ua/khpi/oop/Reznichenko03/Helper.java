package ua.khpi.oop.Reznichenko03;
 
import java.util.Arrays;
import java.util.Scanner;

/**
 * 	\author Dmitry Reznichenko
*/

public class Helper
{
	public static Scanner in = new Scanner(System.in);
    //static functions
    public static  boolean  �onditional�heck(char text)/// �������� ������ �� �����
    {
        return ( text>64&&text<91)||( text>96&&text<=123)||text==32||text==44;
    }
    public static void SortLexicographically(String[] vector)
    {
    	  Arrays.sort(vector);
    }
    
    public static void PrintLineSB(StringBuilder text)///����� ������ �� �������
    {
   	 System.out.println(text);
    } 
    public static void PrintLineS(String  text)///����� ������ �� �������
    {
   	 System.out.println(text);
    }
    public static StringBuilder AddTextSB()
    {
		System.out.print("������ ��� �����: ");
		 StringBuilder s=new StringBuilder();
	return	 s = new StringBuilder(in.nextLine());///���� �����
    }
    public static String AddText()
    {
		System.out.print("������ ��� �����: ");
		 String s=new String();
		return s = in.nextLine();///���� �����
    }
    public static void PrintNewLine(StringBuilder text)///����� ������ �� ������� �� �������� �������������
    {
   	 System.out.println("\n\n��� ����� �����: "+text);
    }
    public static StringBuilder Task6 (StringBuilder  s)//////����������� ������
    {
   	 String temp=new String();
		 boolean spaise=false;
		 for (int i=0;i<s.length();i++)
		 {
			 if (Helper.�onditional�heck(s.charAt(i)))
			 {
				 if (s.charAt(i)==32) spaise=true;//�������� �� �����
				 else 
				 {
					 if(s.charAt(i)==44)///�������� �� ����
				 {
			     temp=temp+s.charAt(i) ;
			     spaise=true;
				 } 
				 else if(spaise==true)///�������� �����
					 
				 {  temp =temp+" "+s.charAt(i);
				    spaise=false;
				    }
				 else temp =temp+s.charAt(i);///�������� ������
				 }
			 }         
       
		 } s=new StringBuilder(temp);
    return s;
    }

    }
    
