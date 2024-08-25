 import java.util.Scanner;
public class IT23277304Lab5Q3{
public static final double Rate1=0.1;
public static final double Rate2=0.2;
public static void main(String[] args){
Scanner j=new Scanner(System.in);
System.out.println("enter the start date");
int sd=j.nextInt();
if(sd>1 && sd<31){
System.out.println("enter the end date");
int ed=j.nextInt();
if(ed>1 && ed<31){
if(sd<ed){
int days=ed-sd;
if(days<3){
     System.out.println("room charge per day is 48,000.00");
     System.out.println("number of days reserved is "+ days);
     System.out.println(" discount percentage is 0%");
    double pay=days*48000;
    System.out.println("total to be paid is "+pay);
}
else if(days<=4){
     System.out.println("room charge per day is 48,000.00");
     System.out.println("number of days reserved is "+ days);
     System.out.println(" discount percentage is 10%");
     double discount=days*48000*Rate1;
     double pay=days*48000;
     double tpay=pay-discount;
     System.out.println("discount price is "+discount);
     System.out.println("total to be paid is "+tpay);
}
else if(days>=5){
             System.out.println("room charge per day is 48,000.00");
             System.out.println("number of days reserved is "+ days);
             System.out.println(" discount percentage is 20%");
             double discount=days*48000*Rate2;
             double pay=days*48000;
             double tpay=pay-discount;
             System.out.println("discount price is "+discount);
             System.out.println("total to be paid is "+tpay);

}
}
else 
System.out.println("start date should less than end date");

}
else 
System.out.println("end date should be geater than 1 and less than 31");

}
else
  System.out.println("start date should be geater than 1 and less than 31");


}
}
