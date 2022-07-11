import java.util.Scanner;
public class palindromest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String orginal;
String reverse="";
System.out.println("Enter the String:");
orginal=sc.nextLine();
int len=orginal.length();
for(int i=len-1;i>=0;i--)
{
reverse=reverse+orginal.charAt(i);
}
if(orginal.equals(reverse))
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}
}




