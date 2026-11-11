import java.util.*;
public class PrintOneToNPrime{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Nth Prime value:");
    int n=sc.nextInt();
    int num=2;  // number to check
    int count=0; // number of primes printed
    
    while(count < n){
    boolean flag=true;
    int i=2; 
    
    while(i < num){
    if(num%i==0){
    flag=false;
    break;
    }
    i++;
    }

   if(flag){
   System.out.print(num+" ");
   count++;
   }
   num++;
  }
 }
}