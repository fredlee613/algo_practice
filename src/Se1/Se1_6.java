package Se1;

import java.util.Scanner;

public class Se1_6 {
    public String dropDuplicate(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i)
                answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Se1_6 T = new Se1_6();
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();
        System.out.println(T.dropDuplicate(input));
    }
}
