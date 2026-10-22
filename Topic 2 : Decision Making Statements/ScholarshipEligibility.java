import java.util.*;
public class ScholarshipEligibility{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter attendance:");
   int att=sc.nextInt();
   
   System.out.print("Enter marks:");
   int marks=sc.nextInt();
   
   if(att >=75 && marks >= 80){
   System.out.print("Eligible for Scholarship");
  }
  else{
  System.out.print("Not eligible");
  }
 }
}