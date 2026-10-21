import java.util.*;
public class QuadraticEquation{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter value of a:");
   int a=sc.nextInt();
   
   System.out.print("Enter value of b:");
   int b=sc.nextInt();
   
   System.out.print("Enter value of c:");
   int c=sc.nextInt();
   
   double d=b*b-4*a*c;
   
   if(d > 0){
    double root1=(-b + Math.sqrt(d))/(2*a);
    double root2=(-b - Math.sqrt(d))/(2*a);
    
    System.out.printf("Root1:.%2f\n",root1);
    System.out.printf("Root2:.%2f\n",root2);
    
    }
    
    else if(d==0){
    double root = (double)-b/(2*a);
    System.out.printf("Root=%.2f\n",root); 
   }
   else{
    System.out.print("Imaginary Roots");
  }
 }
}