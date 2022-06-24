package Se1;

import java.util.Scanner;

public class Se1_1 {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
//        for (int i = 0; i < str.length(); i++)
//            if (str.charAt(i) == c)
//                answer++;
        for (char x : str.toCharArray())
            if (x == c)
                answer++;

        return answer;
    }

    public static void main(String[] args) {
        Se1_1 T = new Se1_1();
        Scanner stdIn = new Scanner(System.in);
        String str = stdIn.next();
        char c = stdIn.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
