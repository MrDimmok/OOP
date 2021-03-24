package ua.khpi.oop.Reznichenko05; 

/**
 * \brief L5
 * 	\author Dmytry Reznihenko
 * 
 * Завдання:
 *Ввести текст. З тексту видалити всі символи, крім пропусків, які не є буквами.
 * Пропуски, що повторюються, замінити на одиночні. Між послідовностями літер,
 *  де знаходяться розділові знаки, залишити хоча б один пропуск ("a,b,c" -> "a, b, c").
 *   Вивести початковий текст та результат.
 */ 
 import java.util.Scanner;
 
 public class Main {
	 
	public static Scanner in = new Scanner(System.in);
	public static void main(final String[] args) {
    	 
		System.out.print("Введіть ваш текст: ");
		Container s=new Container();
		String s2=new String(in.nextLine());
		s.add(s2);
		Iterator<String> iterator=s.iterator(); 

		 Helper.PrintLine(s.toString());///вивод тексту
		s=Helper.Task6(s);///основне завдання

		 
		Helper.PrintNewLine(s.toString());///;вивод відредагованого текту
		System.out.print("\nВивод через iтератор(while):");
        while (iterator.hasNext())
       {
   	    System.out.print(iterator.next().toString());
       }

    }
}
