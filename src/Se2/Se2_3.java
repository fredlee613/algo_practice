package Se2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Se2_3 {
    public ArrayList<String> solution(int n, int[] a, int[] b) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                answer.add("D");
            } else if (a[i] == 1) {
                if (b[i] == 2) {
                    answer.add("B");
                }
                else answer.add("A");
            } else if (a[i] == 2) {
                if (b[i] == 3) {
                    answer.add("B");
                }
                else answer.add("A");
            } else if (a[i] == 3) {
                if (b[i] == 1)
                    answer.add("B");
                else answer.add("A");
            }
        }
        return answer;
    }

    public ArrayList<String> solution1(int n, int[] a, int[] b) {
        ArrayList<String> answer1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer1.add("D");
            else if (a[i] == 1 && b[i] == 3) answer1.add("A");
            else if (a[i] == 2 && b[i] == 1) answer1.add("A");
            else if (a[i] == 3 && b[i] == 2) answer1.add("A");
            else answer1.add("B");
        }
        return answer1;
    }

    public static void main(String[] args) {
        Se2_3 T = new Se2_3();
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] a = new int[n], b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = stdIn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = stdIn.nextInt();
        }
        for (String x : T.solution1(n, a, b)) {
            System.out.println(x);
        }
    }
}
