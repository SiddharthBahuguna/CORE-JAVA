import java.util.*;
public class EmployeeSalaryRange{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter level:");
     int level=sc.nextInt();
     
     switch(level){
           case 1: 
                System.out.print("Junior (20,000-30,000)");
                break;
           case 2:
                System.out.print("Mid (31,000-50,000)");
                break;
           case 3:
                System.out.print("Senior (51,000-80,000)");
                break;
           default:
                System.out.print("Invalid Level");
                break;
                }
         }
}
     