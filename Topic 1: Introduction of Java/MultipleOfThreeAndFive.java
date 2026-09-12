import java.util.*;
public class MultipleOfThreeAndFive{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number:");
  int n=sc.nextInt();
  
  if(n%3==0 && n%5==0){
   System.out.print("Yes multiple of both 3 and 5");
   }
  else{
  System.out.print("No");
  }
 }
}