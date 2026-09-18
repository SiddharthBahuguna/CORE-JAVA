import java.util.*;
public class TempConverterr{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter value in Celsius:");
  double c = sc.nextDouble();
  double CtoF = (c*9/5)+32;
  System.out.printf("Fahrenheit:%.2f",CtoF);
  }
}