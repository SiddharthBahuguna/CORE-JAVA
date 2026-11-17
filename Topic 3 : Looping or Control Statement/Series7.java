import java.util.*; //1 1 2 3 5 8 13 21 34
public class Series7{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    int first=1,second=1;
    
    for(int i=1;i<=n;i++){
    System.out.print(first+" ");
    int third=first+second;
    first=second;
    second=third;
    }
   }
}
