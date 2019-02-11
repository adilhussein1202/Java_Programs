import java.util.*;
class fibo
{
public static void main(String args[])
{
int n, f1=0, f2=1, next,i=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number : ");
n=sc.nextInt();
System.out.print(f1+ " " +f2);
while(i<=n-3)
{
next = f1+f2;
System.out.print(" " +next);
f1=f2;
f2=next;
i++;
}
}
}