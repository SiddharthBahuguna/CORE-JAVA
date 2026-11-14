import java.util.*;
public class ReverseNaturalNumbers{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter number:");
     int n=sc.nextInt();
     int counter = n;
 
     while(counter >= 1)
     {
      System.out.print(counter+" ");
      counter--;
      }
    }
 }