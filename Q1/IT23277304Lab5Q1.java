import java.util.Scanner;
public class IT23277304Lab5Q1{
public static void main(String[] args){
Scanner j=new Scanner(System.in);
System.out.println("enter the first integer");
int a=j.nextInt();
System.out.println("enter the second integer");
int b=j.nextInt();
System.out.println("enter the third integer");
int c=j.nextInt();
System.out.print(a);
System.out.print("\t");
System.out.print(b);
System.out.print("\t");
System.out.println(c);
int min=a;
int max=a;
if(a>b)
min=b;
if(b>a)
max=b;
if(a>c)
min=c;
if(c>a)
max=c;
System.out.println("minium number is "+min);
System.out.println("maximum number is "+max);




}
}