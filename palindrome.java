import java.util.*;
import java.util.Scanner;
public class palindrome
{
public static void main(String args[])
{
String original;
String reverse="";
Scanner word=new Scanner(System.in);
System.out.println("Enter the String to check whether it is palindrome or not=");
original=word.nextLine();
System.out.println("The entered string length is="+original.length());
for(int i=original.length()-1; i>=0; i--)
{

System.out.println(reverse+=original.charAt(i));
}
if(original.equals(reverse))
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not a Palindrome");
}
}
}


