import java.util.*;
public class SumOfFirstAndLastDigit{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
 
   System.out.print("Enter number:");
   int n=sc.nextInt();
   int ld=n%10;;
   
   int i=0;
   while(n >=10){
   n=n/10;
   i++;
  }
  int fd=n;

  int ans=fd+ld;
  
  System.out.print(ans);
 }
}