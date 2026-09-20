import java.util.*;
public class TriangleValidator{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int x1=sc.nextInt();
   int x2=sc.nextInt();
   int x3=sc.nextInt();
    
   if(x1+x2+x3==180){
   System.out.print("Valid Triangle");
   }
   else{
  System.out.print("Not Valid");
  }
 }
}