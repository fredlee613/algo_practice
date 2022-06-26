package Se2;

import java.util.Scanner;

public class Se2_7 {
    public int solution(int n, int[] arr) {
        int answer = arr[0];
        int cnt = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == 0){
                cnt = 0;
            }
            else {
                cnt++;
                answer += cnt;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Se2_7 T = new Se2_7();
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = stdIn.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
