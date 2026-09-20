import java.util.*;
public class ToggleCase{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a character:");
  char ch=sc.next().charAt(0);
  char toggleChar;

  if(ch >= 'a' && ch <='z'){
   toggleChar=(char) (ch-32);
  }
  else if(ch >='A' && ch <='Z'){
  toggleChar=(char) (ch+32);
  }
  else{
  toggleChar=ch;
 }
 System.out.print("Toggled character:"+toggleChar);
}
}