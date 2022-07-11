public class reveachword
{
public static void main(String args[])
{
String st="Welcome to java";
String rev=" ";
String revwords=" ";
String words[]=st.split(" ");
for(String w:words)
{
for(int i=w.length()-1;i>=0;i--)
{

revwords=revwords+w.charAt(i);
}
}

rev=rev+revwords+" ";
System.out.println(rev);
}
}

/*if(st.charAt(i)==' ' && st.charAt(i+1)!=' ')
{
}*/
