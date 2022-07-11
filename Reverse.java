import java.util.*;
import java.util.Scanner;

public class Reverse
{
public static void main(String args[])
{
int num;
Scanner n=new Scanner(System.in);
System.out.println("Enter The Number to check Whether armstong or not:");
num=n.nextInt();
n.close();
int rem,rev=0;
while(num>0)
{
rem=num%10;
rev=rev*10+rem;
num=num/10;
System.out.println("The reversed number is:"+rev);
}}}

