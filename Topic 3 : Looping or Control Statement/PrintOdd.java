import java.util.*;
public class PrintOdd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int counter=1;
    while(counter <= 100){
    if(counter % 2!=0){
    System.out.print(counter+" ");
    }
    counter++;
    }
  }
}