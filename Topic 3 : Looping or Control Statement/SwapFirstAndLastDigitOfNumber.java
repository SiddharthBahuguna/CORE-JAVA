import java.util.*;
public class SwapFirstAndLastDigitOfNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    
    int original=n;
    int ld = n % 10;
   
    int p=1;
    while(n >=10){
    n = n/10;
    p = p*10;
    }
    int fd = n; 
    
    int middle = (original % p)/10;
    
    // (last digit at front) + (middle digits shifted) + (first digit at end)
    int swappedNum = (ld * p) + (middle*10) + fd;

    System.out.println("Swapped Number:"+swappedNum);
   }
}