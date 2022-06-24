package Se1;

import java.util.ArrayList;
import java.util.Scanner;

public class Se1_5 {
    public void solution(String str) {
        char[] charArray = str.toCharArray();
        char tmp;
        for (int i = 0; i < charArray.length / 2; i++) {
            if ((charArray[i] >= 65 && charArray[i] <= 90) || (charArray[i] >= 97 && charArray[i] <= 122)) {
                tmp = charArray[i];
                charArray[i] = charArray[charArray.length - i - 1];
                charArray[charArray.length - i - 1] = tmp;
            }
        }
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
    }

    public String solution1(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while(lt < rt) {
            if (!Character.isAlphabetic(s[lt]))
                lt++;
            else if (!Character.isAlphabetic(s[rt]))
                rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }


    public static void main(String[] args) {
        Se1_5 T = new Se1_5();
        Scanner stdIn = new Scanner(System.in);
        String str = stdIn.nextLine();
        System.out.println(T.solution1(str));
    }
}

