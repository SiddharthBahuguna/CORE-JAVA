import java.util.*;
public class PrintHarshadNumbersUntilN{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    
    for(int i=1; i <=n; i++){
    int temp=i;
    int sum = 0;
    while(temp!=0){
    int ld = temp % 10;
    sum = sum+ld;
    temp = temp/10;
    }
    
    if(i % sum == 0){
    System.out.print(i+" ");
   }
  }
 }
}