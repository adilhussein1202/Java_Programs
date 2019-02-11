import java.util.*;
class example
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
int[] arr=new int[10];
System.out.println("Enter the value of array");
for(i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}
System.out.println(Arrays.toString(arr));
}
}