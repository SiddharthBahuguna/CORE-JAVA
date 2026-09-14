import java.util.*;
public class ProfitLossCalculator{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter CP:");
  int CP=sc.nextInt();

  System.out.print("Enter SP:");
  int SP=sc.nextInt();
  
  if(SP > CP){
  System.out.print("Profit");
  }
  else if(SP < CP){
  System.out.print("Loss");
  }
  else{
  System.out.print("No profit and No Loss");
  }
 }
}