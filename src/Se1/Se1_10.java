package Se1;

import java.util.Scanner;

public class Se1_10 {
    public int[] solution(String str, char target) {
        int[] answer = new int[str.length()];
        int p = 1818;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 2828;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == target) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Se1_10 T = new Se1_10();
        Scanner stdIn = new Scanner(System.in);
        String str = stdIn.next();
        char target = stdIn.next().charAt(0);
        for (int x : T.solution(str, target))
            System.out.print(x + " ");
    }
}
