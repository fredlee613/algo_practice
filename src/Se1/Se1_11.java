package Se1;

import java.util.Scanner;

public class Se1_11 {
    public String solution(String str) {
        String answer = "";
        str += " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) cnt++;
            else {
                answer += str.charAt(i);
                if (cnt > 1)
                    answer += String.valueOf(cnt);
                    cnt = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Se1_11 T = new Se1_11();
        Scanner stdIn = new Scanner(System.in);
        String str = stdIn.next();
        System.out.println(T.solution(str));
    }
}
