import java.util.*;
import java.util.Scanner;
public class factorial
{
public static void main(String args[])
{
int num;
int fact=1;
Scanner n=new Scanner(System.in);
System.out.println("Enter the Number to get Factorial value=");
num=n.nextInt();
for(int i=1;i<=num;i++)
{ 
fact=fact*i;
}
System.out.println("Factorial of "+ num +" is "+fact);
}
}
