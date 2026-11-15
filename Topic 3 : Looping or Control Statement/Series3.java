import java.util.*;  //1 4 9 16 25 36 49 64 81 100
public class Series3{    
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter n:");
     int n=sc.nextInt(); 
     
     for(int i=1;i<=n;i++){
     int sq=i*i;
     System.out.print(sq+" ");
     }
    }
}