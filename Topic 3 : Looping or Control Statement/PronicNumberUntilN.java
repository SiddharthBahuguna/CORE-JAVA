import java.util.*;
public class PronicNumberUntilN{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    
    for(int i=1; i <= n; i++){
      for(int x=1; x < i; x++){
         if(x*(x+1)==i){
            System.out.print(i + " ");
            break;
            }
        }
    }
  }
}