import java.util.*;
class palin
{                                                                 
public static void main(String args[])
{
int num,n,remainder,reverse = 0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number to be checked : ");
num=sc.nextInt();
n=num;
while(n!=0)
{
remainder = n%10;
reverse=reverse*10+remainder;
n=n/10;
}
if(reverse==num)
{
System.out.println("Entered number is palindrome : "+reverse);
}
else
{
System.out.println("Entered number is not palindrome");
}
}}