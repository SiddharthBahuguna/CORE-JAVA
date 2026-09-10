import java.util.*;
public class MarksCalculator{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter marks of 5 subjects:");
  int x1 = sc.nextInt();
  int x2 = sc.nextInt();
  int x3 = sc.nextInt();
  int x4 = sc.nextInt();
  int x5 = sc.nextInt();
  
  int total = x1+x2+x3+x4+x5;
  double percentage = (total/5);

  System.out.printf("Total:%d \tPercentage:%.2f\n" ,total,percentage);
  }
}
  