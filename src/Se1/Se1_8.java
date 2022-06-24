package Se1;

import java.util.Locale;
import java.util.Scanner;

public class Se1_8 {
    public String solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isAlphabetic(x))
                answer += x;
        }

        StringBuilder sb = new StringBuilder(answer);
        String reverse = sb.reverse().toString();
        return (answer.equalsIgnoreCase(reverse)) ? "YES" : "NO";
    }

    public String solution1(String str) {
        String answer = "NO";
        str = str.toUpperCase().replace("^[A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Se1_8 T = new Se1_8();
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();
        System.out.println(T.solution1(input));

    }
}
