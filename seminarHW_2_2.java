// Сравнить время выполнения замены символа "а"
//на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.
import java.util.Math;
public class seminarHW_2_2 {
  private static void replacingChar() {
     public static void main(String[] args) { 
    String randomString = usingMath(); 
    System.out.println("Random string is: " + randomString); }
    } 
  static String usingMath() { 
    String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz"; 
    String numbers = "0123456789"; 
    // create a super set of all characters 
    String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers; 
    // initialize a string to hold result 
    StringBuffer randomString = new StringBuffer(); 
    // loop for 10 times 
    for (int i = 0; i < 10; i++) { 
      // generate a random number between 0 and length of all characters 
      int randomIndex = (int)(Math.random() * allCharacters.length()); 
      // retrieve character at index and add it to result 
      randomString.append(allCharacters.charAt(randomIndex)); 
    } 
    return randomString.toString(); 
  } 
}
        StringBuilder builder = new StringBuilder(str);

        long start = System.currentTimeMillis();
        for (int i = 0; i < str.length(); i++) {
            str = str.replace('a','A');
        }
//        System.out.println(str);
        System.out.println("String time = " + (System.currentTimeMillis() - start));
//
        start = System.currentTimeMillis();
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == 'a') {
                builder.setCharAt(i, 'A');
            }
        }
//        
}