import java.util.*;
public class AreaEqTriangle{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter side of triangle:");
  int side = sc.nextInt();
  
  double area = ((Math.sqrt(3)/4) * Math.pow(side,2));
  
  System.out.printf("Area:%.2f",area);
  }
}