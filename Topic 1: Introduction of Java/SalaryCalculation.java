import java.util.*;
public class SalaryCalculation{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Basic Salary:");
  int salary=sc.nextInt();
  
  double totalSalary=salary+salary*0.50+salary*0.25;

  System.out.print("Gross Salary:"+totalSalary);
 }
}