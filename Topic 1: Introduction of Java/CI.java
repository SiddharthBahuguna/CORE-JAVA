import java.util.*;
public class CI{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);

  System.out.print("Enter Principal:");
  int p=sc.nextInt();
  System.out.print("Enter Rate:");
  int r=sc.nextInt();
  System.out.print("Enter Time:");
  int t=sc.nextInt();
 
  double ans=p*(Math.pow((1+r/100.0),t))-p;

  System.out.printf("Compound Interest:%.2f",ans);
  }
}