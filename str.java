import java.util.*;
import java.io.*;
class str
{
public static void main(String args[])
{
String a, reverse = "";
int i,l;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string : ");
a=sc.nextLine();
l=a.length();
for(i=l-1;i>=0;i--)
{
reverse = reverse + a.charAt(i);
}
if(reverse.equalsIgnoreCase(a))
{
System.out.println("String is palindrome");
}
else
{
System.out.println("String is not palindrome");
}
}}