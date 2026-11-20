public class ReverseNumber {
    public static void main(String[] args) {
        int num = 100;
        
        String reversedStr = new StringBuilder(String.valueOf(num)).reverse().toString();
        
        System.out.println("Reversed String: " + reversedStr);
    }
}
