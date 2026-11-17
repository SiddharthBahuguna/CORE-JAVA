import java.util.*; //2 6 12 20 30 42 56 72 90 110
public class Series8{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
    int ans=i*(i+1);
    System.out.print(ans+" ");
   }
 }
} 