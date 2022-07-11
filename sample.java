import java.util.Scanner;
import java.io.*;
class sample
{
public static void main(String args[])
{
int item_number[]={101,102,103,104};
String item_name[]={"milk","cheese","ghee","bread"};
float price[]={42,50,500,40}; 
int stock[]={10,20,15,16};
Scanner sc=new Scanner(System.in);
System.out.println("Enter the item_number:");
int item=sc.nextInt();
System.out.println("Enter the Quantity:");
int st=sc.nextInt();
for(int i=0;i<item_number.length;i++)
{
if(item_number[i]==item)
{
if(stock[i]>=st)
{
System.out.println(item_name[i]+" "+st*price[i]+" INR");
stock[i]=stock[i]-st;
System.out.println(stock[i]+"->left");
}
else{
System.out.println("No Stock");
System.out.println(stock[i]+"->left");
}
}
}
}
}