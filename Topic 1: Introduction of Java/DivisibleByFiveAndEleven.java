import java.util.*;
public class DivisibleByFiveAndEleven{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number:");
  int n=sc.nextInt();
  if(n%5==0 && n%11==0){
  System.out.print("Divisible by 5 and 11");
  }
  else{
  System.out.print("No");
  }
 }
}
