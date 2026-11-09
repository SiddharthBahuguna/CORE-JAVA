import java.util.*;
public class PrintNthDuckNumber{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);

   System.out.print("Enter Nth Duck Numbers:");
   int n=sc.nextInt();
   int count = 0;  //Number of duck numbers printed
   int num=1;      // Current number being checked
   
   while(n > count){
   int temp = num;
   boolean flag=false;

   while(temp!=0){
   int ld=temp%10;
   temp = temp/10;
   
   if(ld == 0){
   flag = true;
   break;
   }
  }
  if(flag){
  System.out.print(num + " ");
  count++;
  }
  
  num++;
  }
 }
}