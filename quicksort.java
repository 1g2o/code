public class quicksort
{
int partition(int a[],int start,int end)
{
int pivot=a[end];
int i=(start-1);
for(int j=start;j<=end;j++)
{
if(a[j]<pivot)
{
i++;
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
int t=a[i+1];
a[i+1]=a[end];
a[end]=t;
return(i+1);
}
void quick(int a[],int start,int end)
{
if(start<end)
{
int p=partition(a,start,end);
quick(a,start,p-1);
quick(a,p+1,end);
}
}
void printArr(int a[],int n)
{
int i;
for(i=0;i<n;i++)
System.out.println(a[i]+"");
}
public static void main(String args[])
{
int a[]={5,8,6,9,3,2,7};
int n=a.length;
quicksort q=new quicksort();
System.out.println("Before Sorting");
q.printArr(a,n);
q.quick(a,0,n-1);
System.out.println("After Sorting");
q.printArr(a,n);
System.out.println();
}
}