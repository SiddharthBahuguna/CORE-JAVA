import java.util.*;
public class PrintTwinPrimeUntilN{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter value of N:");
    int n=sc.nextInt();
    
    for(int i=2; i <=n-2; i++){
    int count1=0;
    int count2=0;
    
    for(int j=1; j <=i; j++){
    if(i % j ==0){
    count1++;
    }
   }
   
   for(int j=1; j<=i+2; j++){
   if((i+2) % j==0){
   count2++;
   }
  }

  if(count1==2 && count2==2){
  System.out.print("("+i+","+(i+2)+") ");
  }
 }
}
}