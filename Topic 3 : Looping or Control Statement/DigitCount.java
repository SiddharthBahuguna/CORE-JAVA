import java.util.*;
public class DigitCount{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
     
    for(int i=0; i<=9; i++){
    int temp=n;
    int count=0;

    while(temp!=0){
    int ld=temp%10;
    if(ld==i){
    count++;
    }
    temp=temp/10;
    }
    
    if(count > 0){
    System.out.println(i+" occurs "+count+" times");
    }
   }
  }
}