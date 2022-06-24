package Se1;

import java.util.Scanner;

public class Se1_12 {
    public String solution(String str, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }
        return answer;
    }
    public static void main(String[] args) {
        Se1_12 T = new Se1_12();
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        String str = stdIn.next();
        System.out.println(T.solution(str, n));
    }
}
