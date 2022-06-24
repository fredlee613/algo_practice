package Se1;

import java.util.Scanner;

public class Se1_9 {
    public int solution(String str) {
        String answer = "";
        for (char x : str.toCharArray())
            if (Character.isDigit(x))
                answer += x;
        return Integer.parseInt(answer);
    }

    public int solution1(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }
        return answer;
    }

    public static void main(String[] args) {
        Se1_9 T = new Se1_9();
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();
        System.out.println(T.solution1(input));

    }
}
