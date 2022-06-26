package Se2;

import java.util.Scanner;

public class Se2_9 {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int h = 0, v = 0, d = 0, rd = 0, mcvh = 0, mcdrd = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                h += arr[j][i];
                v += arr[i][j];
            }
            mcvh = Integer.max(mcvh, Integer.max(h, v));
            h = 0;
            v = 0;

            d += arr[i][i];
            rd += arr[i][n - i - 1];
        }
        mcdrd = Integer.max(d, rd);
        answer = Integer.max(mcvh, mcdrd);
        return answer;
    }
    public static void main(String[] args) {
        Se2_9 T = new Se2_9();
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = stdIn.nextInt();
        System.out.print(T.solution(n, arr));
    }
}
