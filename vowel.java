import java.util.*;
class vowel
{
public static void main(String args[])
{
char ch; char b=' ';
Scanner sc=new Scanner(System.in);
System.out.print("Enter the character : ");
ch=sc.next().charAt(0);
b=Character.toLowerCase(ch);
if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
{
System.out.println("Character is vowel");
}
else
{
System.out.println("Character is not vowel");
}
}
}