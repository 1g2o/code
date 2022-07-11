import java.io.*;
import java.util.Scanner;
class vowcon
{
public static void main(String args[])
{
String st;
int vowels=0,consonants=0,digits=0,spaces=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
st=sc.nextLine();
st=st.toLowerCase();
for(int i=0;i<st.length();++i)
{
char ch=st.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
++vowels;
}
else if((ch>='a' && ch<='z'))
{
++consonants;
}
else if(ch>='0' && ch<='9')
{
++digits;
}
else if(ch==' ')
{
++spaces;
}
}
System.out.println("Vowels:"+vowels);
System.out.println("Consonants:"+consonants);
System.out.println("Digits:"+digits);
System.out.println("Spaces:"+spaces);
}
}
