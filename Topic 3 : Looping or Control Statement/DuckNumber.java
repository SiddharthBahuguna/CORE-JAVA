import java.util.*;
public class DuckNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    boolean flag=false;

    while(n!=0){
    int ld = n % 10;
    n=n/10;
    
    if(ld == 0){
    flag = true;
    break;
    }
   }
    if(flag){
    System.out.print("Duck Number"); 
    }
    else{
    System.out.print("Not a Duck Number");
    }
  }
}