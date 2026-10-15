import java.util.*;
public class MobilePlanBilling{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter minutes used:");
   int min=sc.nextInt();
   
   double totalBill=199;
   
   if(min > 100 && min<=300){
   totalBill +=(min-100)*1.0;
   }
   else if(min > 300 && min <= 500){
   totalBill +=(200*1.0)+((min-300)*1.5);
   }
   else if(min > 500){
   totalBill +=(200*1.0)+(200*1.5)+((min-500)*2.0);
   }
   System.out.printf("Total Bill = %.2f\n",totalBill);
   }
}