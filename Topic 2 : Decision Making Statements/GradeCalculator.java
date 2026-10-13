import java.util.*;
public class GradeCalculator{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Physics marks:");
   int p=sc.nextInt();
   
   System.out.print("Enter Chemistry marks:");
   int c=sc.nextInt();

   System.out.print("Enter Biology marks:");
   int b=sc.nextInt();
   
   System.out.print("Enter Maths marks:");
   int m=sc.nextInt();

   System.out.print("Enter Computer marks:");
   int comp=sc.nextInt();

   double percentage=(p+c+b+m+comp)/5.0;
   
   if(percentage >= 90){
   System.out.print("Grade A");
   }
   else if(percentage >= 80){
   System.out.print("Grade B");
   }
   else if(percentage >=70){
   System.out.print("Grade C");
   }
   else if(percentage >=60){
   System.out.print("Grade D");
   }
   else if(percentage >= 40){
   System.out.print("Grade E");
   }
   else{
   System.out.print("Grade F");
   }
  }
}