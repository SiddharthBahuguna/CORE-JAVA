import java.util.*;
public class CabService{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter X price:");
   int x=sc.nextInt();
   
   System.out.print("Enter Y price:");
   int y=sc.nextInt();

   if(x < y){
   System.out.print("FIRST");
   }
   else if(x > y){
   System.out.print("SECOND");
   }
   else{
   System.out.print("ANY");
   }
  }
}