public class duplicate
{
public static void main(String args[])
{
String a[]={"java","c","c++","python","java"};
boolean flag=false;
for(int i=0;i<a.length;i++)
{
for(int j=i+1;i<a.length;j++)
{
if(a[i]==a[j])
{
System.out.println("Duplicate found:"+a[i]);
flag=true;
break;
}
}
}
if(flag==false)
{
System.out.println("Not found");
}

}

}