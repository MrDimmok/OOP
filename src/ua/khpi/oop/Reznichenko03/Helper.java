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
    public static  boolean  СonditionalСheck(char text)/// перевіряє символ на умову
    {
        return ( text>64&&text<91)||( text>96&&text<=123)||text==32||text==44;
    }
    public static void SortLexicographically(String[] vector)
    {
    	  Arrays.sort(vector);
    }
    
    public static void PrintLineSB(StringBuilder text)///вивод тексту на консоль
    {
   	 System.out.println(text);
    } 
    public static void PrintLineS(String  text)///вивод тексту на консоль
    {
   	 System.out.println(text);
    }
    public static StringBuilder AddTextSB()
    {
		System.out.print("Введіть ваш текст: ");
		 StringBuilder s=new StringBuilder();
	return	 s = new StringBuilder(in.nextLine());///ввод даний
    }
    public static String AddText()
    {
		System.out.print("Введіть ваш текст: ");
		 String s=new String();
		return s = in.nextLine();///ввод даний
    }
    public static void PrintNewLine(StringBuilder text)///вивод тексту на консоль із надписом відредагований
    {
   	 System.out.println("\n\nВаш новий текст: "+text);
    }
    public static StringBuilder Task6 (StringBuilder  s)//////редагування тексту
    {
   	 String temp=new String();
		 boolean spaise=false;
		 for (int i=0;i<s.length();i++)
		 {
			 if (Helper.СonditionalСheck(s.charAt(i)))
			 {
				 if (s.charAt(i)==32) spaise=true;//перевірка на пробіл
				 else 
				 {
					 if(s.charAt(i)==44)///перевірка на кому
				 {
			     temp=temp+s.charAt(i) ;
			     spaise=true;
				 } 
				 else if(spaise==true)///написати пробіл
					 
				 {  temp =temp+" "+s.charAt(i);
				    spaise=false;
				    }
				 else temp =temp+s.charAt(i);///написати символ
				 }
			 }         
       
		 } s=new StringBuilder(temp);
    return s;
    }

    }
    
