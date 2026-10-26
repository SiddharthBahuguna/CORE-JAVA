import java.util.*;
public class WeekdayPrinter{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter weekday(1-7):");
   int weekday=sc.nextInt();
   
   if(weekday==1){
   System.out.print("Monday");
   }
   else if(weekday==2){
   System.out.print("Tuesday");
   }
   else if(weekday==3){
   System.out.print("Wednesday");
   }
   else if(weekday==4){
   System.out.print("Thursday");
   }
   else if(weekday==5){
   System.out.print("Friday");
   }
   else if(weekday==6){
   System.out.print("Saturday");
   }
   else if(weekday==7){
   System.out.print("Sunday");
   }
   else{
   System.out.print("Invalid Week Number");
   }
 }
}