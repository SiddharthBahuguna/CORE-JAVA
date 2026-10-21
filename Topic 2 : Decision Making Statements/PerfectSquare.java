import java.util.*;
public class PerfectSquare{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Number:");
  int n=sc.nextInt();
  
  double squareRoot=Math.sqrt(n);
  
  if(squareRoot==(int)squareRoot){
  System.out.print("Perfect Square");
  }
  else{
  System.out.print("Not a Perfect Square");
  }
 }
}