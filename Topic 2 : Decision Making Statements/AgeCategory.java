import java.util.*;
public class AgeCategory{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);

   System.out.print("Enter age:");
   int age=sc.nextInt();

   if(age < 13){
   System.out.print("Child");
   }
   else if(age >=13 && age <=19){
   System.out.print("Teenager");
   }
   else if(age>=20 && age<=59){
   System.out.print("Adult");
   }
   else if(age >=60){
   System.out.print("Senior Citizen");
   }
 }
}
  