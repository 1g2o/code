import java.util.*;
import java.util.Scanner;
public class Prime
{
public static void main(String args[])
{
int num,res;
int flag=0;
System.out.println("Enter any number to check whether it is prime or not:");
Scanner n=new Scanner(System.in);
num=n.nextInt();
n.close();
res=num/2;
if(num==0||num==1)
{
System.out.println(num+ "is not a prime number");
}
else{
for(int i=2;i<=res;i++)
{
if(num%i==0)
{
System.out.println(num +" Not a prime number");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println(num +"It is a prime number");
}
}
}
