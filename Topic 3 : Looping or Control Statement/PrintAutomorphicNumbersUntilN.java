import java.util.*;
public class PrintAutomorphicNumbersUntilN{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    System.out.print("Automorphic Numbers:");
    
    for(int i=1;i<=n;i++){
    int sq=i*i;
    int temp=i;  // store original no. in temp
    boolean flag=true; // assume no. is automorphic
     
    while(temp!=0){
    int digit1 = temp % 10; // get LD of number
    int digit2 = sq % 10; // get LD of square

    if(digit1!=digit2){
    flag = false;
    break;
    }
    temp = temp/10; //remove LD from number
    sq = sq/10; // remove LD from sq.
    }
    
    if(flag){
    System.out.print(i+" ");
    }
   }
  }
}