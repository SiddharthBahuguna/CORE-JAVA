import java.util.*;
public class CandyJar{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   
   int n=10;
   int k=5;
      
   System.out.println("Enter candies required:");
   int order=sc.nextInt(); 
   
   //if the customer enters 0 or a negative number, or enter more than 5 candies
   // then the order is invalid

   if(order <=0 || order > k) {
   System.out.print("Invalid Input");

   //since no candies are sold, the jar still contains 10 candies
   System.out.print("Number of candies left:"+n);
   }
    
  else{
  //the order is valid(between 1 and 5)
  //Displayin the number of candies sold
  System.out.print("Number of candies sold:"+order);
  System.out.print("\nNumber of candies available:"+(n-order));
  }
 }
}
  
  