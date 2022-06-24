package Se1;

import java.util.Locale;
import java.util.Scanner;

public class Se1_7 {
    public String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        return (str.equalsIgnoreCase(reverse)) ? "YES" : "NO";
    }

    public String solution1(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1))
                return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Se1_7 T = new Se1_7();
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();
        System.out.println(T.solution1(input));
    }
}
