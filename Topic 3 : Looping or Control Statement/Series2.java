import java.util.*;   //2 729 4 512 6 343 8 216 10 125 12 64 14 27 16 8 18 1
public class Series2{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter n:");
     int n=sc.nextInt();
     
     for(int i=1; i<=n;i++){
     int evenN=2*i;
     int cubeN=(n-i+1)*(n-i+1)*(n-i+1);
     
     System.out.print(evenN+" "+cubeN+" ");
    }
  }
}
     