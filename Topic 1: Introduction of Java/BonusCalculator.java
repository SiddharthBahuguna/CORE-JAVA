import java.util.*;
public class BonusCalculator{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Rating:");
   int rating=sc.nextInt();
   double bonus;
   
  if(rating > 8){
  bonus=0.15;
  }
  else if(rating>=5 && rating<=8){
  bonus=0.10;
  }
  else{
  bonus=0.0;
  }
  System.out.printf("%.0f%% Bonus",bonus*100);
 }
}