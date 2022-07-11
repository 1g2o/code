
import java.util.Scanner;
class NumberPattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int rows;
System.out.println("Enter the number of rows:");
rows=sc.nextInt();
for(int i=0;i<=rows;i++){
for(int j=0;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
for(int i=rows-1;i>=0;i--){
for(int j=0;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
sc.close();
}
}