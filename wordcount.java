import java.util.Scanner;
class wordcount
{
public static void main(String args[])
{
String text;
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
text=sc.nextLine();
for(char i=0;i<text.length()-1;i++)
{
if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
count++;
}
System.out.println("Total number of words in a String ="+(count+1));

}
}
