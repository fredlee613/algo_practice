package Se2;

import java.util.Scanner;

public class Se2_11 {
    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Se2_11 T = new Se2_11();
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 6; j++) {
                arr[i][j] = stdIn.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
