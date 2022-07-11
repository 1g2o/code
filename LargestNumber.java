class LargestNumber{
static int arr[]={23,55,12,2,78};
public static int largest(){
int max=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]>max)
{
max=arr[i];
}
}
return max;
}
public static void main(String args[]){
System.out.println("The Largest number is="+largest());
}
}