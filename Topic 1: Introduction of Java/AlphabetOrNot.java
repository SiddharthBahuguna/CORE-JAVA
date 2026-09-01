import java.util.*;
public class AlphabetOrNot{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  char ch=sc.next().charAt(0);
  
  if((ch >='a' && ch <='z') || (ch >= 'A' && ch<='Z')){
   System.out.print("Yes, it is a alphabet");
  }
  else{
  System.out.print("Not a alphabet");
  }
 }
}