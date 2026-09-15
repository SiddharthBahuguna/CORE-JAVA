import java.util.*;
public class SalaryCalculator{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Basic Salary:");
  double salary=sc.nextDouble();

 double totalSalary=salary+salary*0.10+salary*0.05;
 double netSalary=totalSalary-totalSalary*0.02;
 
 System.out.printf("Net Salary:%.2f",netSalary);
 }
}

  
  