package Se1;

import java.util.Scanner;

public class Se1_2 {
    public String solution(String str) {
        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isUpperCase(str.charAt(i)))
//                result += Character.toLowerCase(str.charAt(i));
//            else if (Character.isLowerCase(str.charAt(i)))
//                result +=Character.toUpperCase(str.charAt(i));
//        }

//        for (char x : str.toCharArray()) {
//            if (Character.isLowerCase(x))
//                result += Character.toUpperCase(x);
//            else if (Character.isUpperCase(x))
//                result += Character.toLowerCase(x);
//        }

        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122)
                result += (char)(x-32);
            else
                result += (char)(x+32);
        }
        return result;
    }
    public static void main(String[] args) {
        Se1_2 T = new Se1_2();
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.next();

        System.out.println(T.solution(input));
    }
}
