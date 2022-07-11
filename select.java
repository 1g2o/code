import java.io.*;
import java.util.Scanner;
public class select
{
/*public static void selectionsort(int arr[])
{
for(int i=0;i<a.length-1;i++)
int index=i;
for(int j=i+1;j<a.length;j++)
if(arr[j]<arr[index])
{
index=j;
}

int temp=a[index];
a[index]=a[i];
a[i]=temp;
}
public static void mian(String args[])
{
int a[]={9,8,3,5,2,6};
for(int i:a)
System.out.println(i+"");
System.out.println();
selectionsort(a);
for(int i:a)
System.out.println(i+"");
}
}*/
public static void main(String args[])
{
int size,i,j,temp;
int arr[]=new int[50];
Scanner sc=new Scanner(System.in);
size=sc.nextInt();
for(i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<size;i++)
{
for(j=i+1;j<size;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(i=0;i<size;i++)
{
System.out.println(arr[i]+"");
}
}
}

