import java.util.*;
public class NeonNumber{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter number:");
   int n=sc.nextInt();
   int temp=n;
   int sum=0;
   
   int sq=n*n;
   while(sq!=0){
   int ld=sq%10;
   sum = sum+ld;
   sq=sq/10;
   }
   if(sum==temp){
   System.out.print("Neon Number");
   }
   else{
   System.out.print("Not Neon Number");
   }
  }
}
 