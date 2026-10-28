import java.util.*;
public class EvenOddPlacesSum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    
    int evenSum=0;
    int oddSum=0;
    int position=1;
    
    while(n!=0){
    int digit = n%10;

    if(position%2==0){
    evenSum=evenSum+digit;
    }
    else{
    oddSum=oddSum+digit;
    }
    n=n/10;
    position++;
    }

    int difference=evenSum-oddSum;
    System.out.println("Even places sum:"+evenSum);
    System.out.println("Odd places sum:"+oddSum);
    System.out.println("Difference:"+difference);
    }
}