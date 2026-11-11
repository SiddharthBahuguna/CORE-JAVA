import java.util.*;
public class PrintPrime{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    
    if(n > 1){        // this loop is for handling 0 and -ve values
    boolean flag=true;
    int i=2;
    
    while(n > i){
    if(n % i ==0){
    flag = false;
    break;
   }
   i++;
   }

   if(flag){
   System.out.println("Number is prime");
   }
  }            // -ve and 0 handling loop closes

  else{
  System.out.println("Number is not prime");
  }
 }
}    