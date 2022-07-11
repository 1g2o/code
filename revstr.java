import java.io.*;
import java.util.Scanner;
class revstr
{
public static void main(String args[])
{
String s;
String rev="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
s=sc.nextLine();
for(int i=0;i>=s.length()-1;i--)
{
rev=rev+s.charAt(i);
}
System.out.println("The Reversed String:"+rev);
}
}

