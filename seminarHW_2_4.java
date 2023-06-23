//Дана строка: ".3 + 1.56 = " подсчитать результат и добавить к строке.

public class seminarHW_2_4{
    public static void main (String[] args) {
        String str = ".3 + 1.56 = ";
        
        double num1 = Double.parseDouble(str.substring(0, 2));
        double num2 = Double.parseDouble(str.substring(5, 9));
       
        double result = num1 + num2;

        String resultString = String.valueOf(result);
        str += resultString;

        System.out.println(str);
        }   
    }  
       

