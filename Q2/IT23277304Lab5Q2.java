import java.util.Scanner;
public class IT23277304Lab5Q2{
public static void main(String[] args){
Scanner p=new Scanner(System.in);
System.out.println("enter the new numbers of members");//get the number as a input
int mem=p.nextInt();
if(mem>=0){
//code execute if mem greater than 0
switch(mem){
case 0:System.out.println("no price");
break;
case 1: System.out.println(" The prize is :pen");
break;
case 2: System.out.println(" The prize is :umbrella");
break;
case 3:  System.out.println(" The prize is :bag");
break;
case 4: System.out.println(" The prize is :Travelling chair ");
break;
default: System.out.println(" The prize is :Headphone");
break;
}
}
 else
 System.out.println("invalid number");

}
}
