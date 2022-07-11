class MaximumDifference
{
int maxdiff(int arr[],int arr_size)
{
int maxdiff=arr[1]-arr[0];
int i,j;
for(i=0;i<arr_size;i++)
{
for(j=i+1;j<arr_size;j++)
{
if(arr[i]-arr[j]>maxdiff)

maxdiff=arr[i]-arr[j];
System.out.println("max diff between two values"+maxdiff);
}
}
return maxdiff;
}
public static void main(String args[])
{
int arr[]={23,67,54,78,90};
MaximumDifference maxdif=new MaximumDifference();
System.out.println("Maximum difference is"+maxdif.maxdiff(arr,5));
}
}
