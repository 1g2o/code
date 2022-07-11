import java.io.*;
import java.util.Arrays;
public class insert
{
public static insertionsort(int arr[])
{
for(int i=1;i<arr.length;i++)
{
int j=i;
while((j>0)&&arr[j-1]>arr[i])
{
int temp=arr[j];
arr[j]=arr[j-1];
arr[j-1]=temp;
j--;
}
}
return arr;
}
public static void main(String args[])
{
int arr[]=new int[]{2,6,7,3,4,8};
arr=insertionsort(arr);
System.out.println(Arrays.toString(arr));
}
}











