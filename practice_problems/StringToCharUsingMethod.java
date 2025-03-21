public class StringToCharUsingMethod {
    public static void main(String[] args) {
        String str = "hola, watashiwa joydeep desu";
        
        char[] charArray = str.toCharArray();
        
        System.out.println("String to char array:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}