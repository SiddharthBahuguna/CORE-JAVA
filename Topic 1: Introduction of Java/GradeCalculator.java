import java.util.*;
public class GradeCalculator{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter marks:");
  int marks=sc.nextInt();
  
  String grade;
  grade = (marks>=90) ? "Excellent" :(marks>=75) ? "Good" : (marks>=50) ? "Average" : "Poor";
  System.out.print(grade);
  }
}