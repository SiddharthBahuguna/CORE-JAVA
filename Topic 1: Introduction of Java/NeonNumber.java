import java.util.*;
public class NeonNumber{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Number:");
  int n=sc.nextInt();
  
  int sq=n*n;
  int sum = 0;
  
  while(sq > 0){
  sum = sum + (sq % 10);
  sq = sq/10;
 }

if(sum == n){
  System.out.println("Neon Number");
 }
else{
 System.out.println("Not Neon Number");
  }
 }
}
  