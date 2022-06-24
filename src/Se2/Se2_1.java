package Se2;

import java.util.ArrayList;
import java.util.Scanner;

public class Se2_1 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n ; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }


        return answer;
    }
    public static void main(String[] args) {
        Se2_1 T = new Se2_1();
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = stdIn.nextInt();
        }
        for (int x : T.solution(num, arr)) {
            System.out.print(x + " ");
        }
    }
}
