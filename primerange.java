import java.io.*;
import java.util.Scanner;
class primerange
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int low=sc.nextInt();
int high=sc.nextInt();
while(low<high)
{
boolean flag=false;
for(int i=2;i<=low/2;i++)
{
if(low%i==0)
{
flag=true;
break;
}
}
/*public static boolean checkprimeNumber(int num)
{
if(checkprimeNumber(low))
boolean flag=true;
for(int i=2;i<=num/2;i++)
{
if(low%i==0)
{
flag=false;
break;
}
}
return flag;
}*/

if(!flag && low!=0 && low!=1)
System.out.println("prime numbers between the range:"+" "+low);
low++;
}
}
}