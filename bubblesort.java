import java.util.Arrays;
public class bubblesort
{
public static void main(String args[])
{
int a[10]={4,2,1,3,5};
System.out.println("Before sorting:"+Arrays.toString(a));
for(int i=0;i<=a.length-1;i++)
{
for(int j=0;j<=a.length-1;j++)
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("After sorting:"+Arrays.toString(a));
}
}