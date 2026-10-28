import java.util.*;
public class DisariumNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    
    int original = n;
    int temp = n;
    int count = 0;
    
    while(temp!=0){
    count++;
    temp = temp/10;
    }
    temp = n; //reset to original temp
    
    int sum = 0;
    
    while(temp!=0){
    int digit = temp % 10;
    sum = sum + (int) Math.pow(digit,count);
    temp = temp/10;
    count--;
   }
   
   if(sum == original){
   System.out.println("Disarium Number");
   }
   else{
   System.out.println("Not a Disarium Number");
   }
 }
}