import java.util.*;
public class SI{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Principal:");
  int p=sc.nextInt();
  System.out.print("Enter Rate:");
  int r=sc.nextInt();
  System.out.print("Enter Time:");
  int t=sc.nextInt();

  double ans=(p*r*t)/100;

  System.out.printf("Simple Interest:%.2f", ans);
  }
}