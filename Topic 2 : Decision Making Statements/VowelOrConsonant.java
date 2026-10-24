import java.util.*;
public class VowelOrConsonant{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter character:");
     char ch=sc.next().charAt(0);
     ch=Character.toLowerCase(ch);
     
     switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                  System.out.print("Vowel");
                  break;
            default:
                  System.out.print("Consonant");
               }
        }
}
      
