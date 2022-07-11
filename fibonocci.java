
import java.util.Scanner;
public class fibonocci 
{
public static void main(String args[])
{
int num1=0;
int num2=1;
int nextnum;
int los;
System.out.println("Enter the Length of the series:");
Scanner scan= new Scanner(System.in);
los=scan.nextInt();
scan.close();
System.out.println(num1+""+num2);
for(int i=2;i<los;++i)
{
nextnum=num1+num2;
System.out.println(""+nextnum);
num1=num2;
num2=nextnum;
}
}
}
