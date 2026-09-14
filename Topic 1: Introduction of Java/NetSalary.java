import java.util.*;
public class NetSalary{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Basic Salary:"); 
  int salary=sc.nextInt();

  System.out.print("Enter Tax Rate=");
  int tax=sc.nextInt();

  double taxAmount=salary*(tax/100.0);
  double netSalary=salary-taxAmount;

  System.out.print("Net Salary:"+netSalary);
 }
}