import java.util.*;
public class SumFirstLastDigit{
 static int firstDigit(int num){
  if(num < 10){
    return num;
  }
 return firstDigit(num/10);
}

 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number:");
  int n=sc.nextInt();
  n = Math.abs(n);
  int LD = n%10;
  int FD = firstDigit(n);
  int sum=LD+FD;
  System.out.print("Sum:"+sum);
  }
}
  
  
  


































  