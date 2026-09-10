import java.util.*;
public class LengthConverter{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter value in centi-meter:");
  double cm = sc.nextDouble();

  double meters = cm/100;
  double km = cm/100000;
  
  System.out.printf("Meter: %.2f\n", meters);
  System.out.printf("Kilometers: %.6f\n", km);
  }
}