import java.util.*; //100 81 64 49 36 25 16 9 4 1
public class Series9{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    
    for(int i=n;i>=1;i--){
    int sq=i*i;
    System.out.print(sq+" ");
    }
  }
}