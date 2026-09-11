import java.util.*;
public class MiddleValueFinder{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter p,q,r values:");
   int p=sc.nextInt();
   int q=sc.nextInt();
   int r=sc.nextInt();
   
   int middle = (p > q) ? (p < r ? p : (q > r ? q : r)) : (q < r ? q : (p > r ? p : r));
   
   System.out.println("Middle Number = " + middle);
  }
}

