import java.util.*;
public class HappyNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number:");
    int n=sc.nextInt();
    int sq;
     
    //Every happy number will end with 1
    //Every non happy number will end with 4
    while(n!=1 && n!=4){
    int sum = 0;
    
    
    while(n!=0){
    int ld = n%10;
    sum = sum + (ld*ld);
    n = n/10;
    }
    
    n=sum;
   }
    if(n == 1){
    System.out.print("Happy Number");
    }
    else{
    System.out.print("Not a Happy Number");
    }
  }
}