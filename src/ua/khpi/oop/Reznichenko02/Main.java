package ua.khpi.oop.Reznichenko02;

/**
 * 	\author Dmitry Reznichenko
 *  ������ ������� ��� ��������� ���� � ����������� ������ �������������� ��������.
 */

import java.util.Scanner;
public final class Main {///�������� ����
   public static Scanner in = new Scanner(System.in);///��� �����

    public static void main(final String[] args)///������� �������
    {
          Positions();

    }
    public static void Positions()///������ ������� ��� ��������� ���� � ����������� ������ �������������� ��������.
    {
        System.out.print("\n\n");
        System.out.print("\n������ ���� �����: ");
        int num;
        num = in.nextInt();

        int k=0;
        String s=new String( Integer.toString(num));
        k=s.charAt(0);
        String pos=new String();
        for (int i=0 ;i<s.length();i++)
        {
            if (k>s.charAt(i)){
                k = s.charAt(i);
                pos=Integer.toString(i + 1);
            }

            else if(k==s.charAt(i))  pos=pos+" "+ (i + 1);

        }
        System.out.print("������� ��� ��������� ����: "+pos);

    }
}
