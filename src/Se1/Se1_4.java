package Se1;

import java.util.ArrayList;
import java.util.Scanner;

public class Se1_4 {
    public void solution1(String str) {
        String result = "";
        StringBuilder sb = new StringBuilder(str);
        result = sb.reverse().toString();
        System.out.println(result);
    }

    public ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public ArrayList<String> solution3(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>(n);
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Se1_4 T = new Se1_4();
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        String[] strArr = new String[n];
//        for (int i = 0; i < n; i++) {
//            T.solution1(stdIn.next());
        for (int i = 0; i < n; i++) {
            strArr[i] = stdIn.next();
        }
        for (String x : T.solution3(n, strArr))
            System.out.println(x);
    }
}
