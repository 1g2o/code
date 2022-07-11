import java.util.*;
import java.util.Scanner;

public class Armstrong
{
public static void main(String args[])
{
int num,temp;
Scanner n=new Scanner(System.in);
System.out.println("Enter The Number to check Whether armstong or not:");
num=n.nextInt();
n.close();
int rem,sum=0;
temp=num;
while(num>0)
{
rem=num%10;
sum=sum+(rem*rem*rem);
num=num/10;
System.out.println(+sum);
}
if(temp==sum)
{
System.out.println("Armstong ");
}
else{
System.out.println("Not Armstrong");
}
}
}

