import java.util.*;
public class TriangleType{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter side1:");
  int x1=sc.nextInt();

  System.out.print("Enter side2:");
  int x2=sc.nextInt();

  System.out.print("Enter side3:");
  int x3=sc.nextInt();

  if(x1==x2 && x2==x3){
  System.out.print("Equilateral Triangle");
  }
  else if(x1==x2 || x2==x3 || x3==x1){
  System.out.print("Isosceles Triangle");
  }
  else{
  System.out.print("Scalene Triangle");
  }
 }
}
