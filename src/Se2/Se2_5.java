package Se2;

import java.util.Scanner;

public class Se2_5 {
    public int solution(int n) {
        int[] prime = new int[n];
        int answer = 0;
        prime[answer++] = 2;
        prime[answer++] = 3;
        for (int i = 5; i < n; i += 2) {
            boolean flag = false;
            for (int j = 1; prime[j] * prime[j] <= i; j++) {
                if (i % prime[j] == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime[answer++] = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Se2_5 T = new Se2_5();
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        System.out.println(T.solution(n));
    }
}
