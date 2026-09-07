import java.util.*;
public class DaysConverter{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number of days:");
  int days=sc.nextInt();
  
  int years=days/365;          // find no. of years
  days = days-(years*365);  
  int months = days /30;      // find no. of months from remainder
  days = days - (months*30); 
  int weeks = days/7;         // find no. of weeks from remainder

  System.out.print("Years="+years);
  System.out.print("Months="+months);
  System.out.print("Weeks="+weeks);
  }
}