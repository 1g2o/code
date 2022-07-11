import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class exp
{
public static void main(String args[])
{
boolean flag=false;
int count=1;
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
/*System.out.println("Enter the array size:");
n=sc.nextInt();*/
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
arr[0]=count;
for(int i=0;i<5;i++)
{
if(arr[i]<arr[i+1]);
{
count++;
flag=true;
break;
}
}
System.out.println(count);
}
}


