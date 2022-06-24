package Se2;


import java.util.Scanner;

public class Se2_2 {
    public int solution(int[] arr) {
        int cnt = 1;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Se2_2 T = new Se2_2();
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = stdIn.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
