import java.util.*;
public class PrintNaturalNumbers{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter value of n");
     int n=sc.nextInt();
     
     int counter=1;
     while(n >= counter)
     {
     System.out.print(counter+" ");
     counter++;
     }
   }
} 
     