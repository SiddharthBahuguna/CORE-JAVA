import java.util.*;
public class PrintKaprekarNumberUntilN{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number:");
    int n=sc.nextInt();
    
    for(int i=1; i <= n; i++){
    int sq = i*i;
    int temp = i;
    int count = 0;

    while(temp!=0){
    count++;
    temp = temp/10;
    }
    int divisor = (int) Math.pow(10,count);
    int right = sq % divisor;
    int left = sq / divisor;
    
    if(left+right == i){
    System.out.print(i+" ");
    }
   }
  }
} 