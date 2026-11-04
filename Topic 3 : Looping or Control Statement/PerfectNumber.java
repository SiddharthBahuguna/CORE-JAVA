import java.util.*;
public class PerfectNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    int i=1,sum=0;
     
    while(n > i){
    if(n % i == 0){
    sum = sum + i;
     }
     i++;
    }
    if(sum == n){
    System.out.print("Perfect Number");
    }
    else {
    System.out.print("Not a Perfect Number");
   }
  }
}