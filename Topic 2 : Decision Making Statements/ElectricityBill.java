import java.util.*;
public class ElectricityBill{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Units:");
   int unit=sc.nextInt();
   double cost;

   if(unit<=50){
   cost=unit*0.50;
   } 
   else if(unit<=150){
   cost=(50*0.50)+((unit-50)*0.75);
   }
   else if(unit<=250){
   cost=(50*0.50)+(100*0.75)+((unit-150)*1.20);
   }
   else{
   cost=(50*0.50)+(100*0.75)+(150*1.20)+(unit-300)*1.50;
   }
  cost=cost+cost*0.20;
 System.out.printf("Total electricity Bill:%.2f",cost);
}
}
