import java.util.Scanner;
class addmatrix
{
public static void main(String args[])
{
int p,q,m,n;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows in first matrix:");
p=sc.nextInt();
System.out.println("Enter the number of columns in first matrix:");
q=sc.nextInt();
System.out.println("Enter the number of rows in second matrix:");
m=sc.nextInt();
System.out.println("Enter the number of rows in second matrix:");
n=sc.nextInt();
if(p==m && q==n)
{
int a[][]=new int[p][q];
int b[][]=new int[m][n];
int c[][]=new int[m][n];
System.out.println("Enter the elements of first matrix:");
for(int i=0;i<p;i++)
{
for(int j=0;j<q;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter the elements of second matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.println("first matrix:");
for(int i=0;i<p;i++)
{
for(int j=0;j<q;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("second matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
for(int i=0;i<p;i++)
{
for(int j=0;j<n;j++)
{
for(int k=0;k<q;k++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
}
System.out.println("Matrix after addition");
for(int i=0;i<p;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
else
{
System.out.println("Addition not possible");
}
}
}