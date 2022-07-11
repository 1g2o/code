import java.io.*;
import java.util.Scanner;
class arrays
{
public static void main(String args[])
{
int a[]=new int[100];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit:");
int n=sc.nextInt();
System.out.println("\n Enter the values:");
for(int i=0;i<=n;i++)
{
a[i]=sc.nextInt();
}
subclass s=new subclass();
s.add(a,n);
}
}
class subclass
{
int total,avg;
public void add(int a[],int n)
{
for(int i=0;i<=n;i++)
{
total=total+a[i];
}
System.out.println("Total="+total);
avg=total/n;
System.out.println("Average="+avg);
}
}
