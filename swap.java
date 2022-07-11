import java.util.*;
import java.util.Scanner;

public class swap
{
public static void main(String args[])
{
int num1,num2,temp;
Scanner a=new Scanner(System.in);
System.out.println("Enter the number1:");
num1=a.nextInt();
Scanner b=new Scanner(System.in);
System.out.println("Enter the number2:");
num2=b.nextInt();
temp=num1;
num1=num2;
num2=temp;
System.out.println("num1="+num1+"num2="+num2);
}
}




