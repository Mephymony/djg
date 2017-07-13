import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a;
if(n<0)
{
n=n * -1;
}
else if(n==0)
{
n=1;
}
while(n>0)
{
n=n/10;
a++;
}
System.out.println("Number of Digits in given number is: "+a);
}
