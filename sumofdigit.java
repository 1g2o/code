import java.util.*;
import java.util.Scanner;

public class sumofdigit
{
public static void main(String args[])
{
int num,digit,sum=0;
Scanner n=new Scanner(System.in);
System.out.println("Enter The Number to check Whether armstong or not:");
num=n.nextInt();
n.close();
while(num>0)
{
digit=num%10;
sum=sum+digit;
num=num/10;
System.out.println(+sum);
}
}
}

