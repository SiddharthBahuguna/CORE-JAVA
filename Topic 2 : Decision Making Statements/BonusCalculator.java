import java.util.*;
public class BonusCalculator{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter years of service:");
   int years=sc.nextInt();
   
   System.out.print("Enter Salary:");
   int salary=sc.nextInt();
   double bonus;
   
   if(years > 5){
   bonus = (double)(salary*0.05);
   }
   else{
   bonus = 0;
   }
   System.out.print("Bonus:"+bonus);
  }
}