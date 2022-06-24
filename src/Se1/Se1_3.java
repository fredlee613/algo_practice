package Se1;

import java.util.Scanner;

public class Se1_3 {
    public String findWordSplit(String str) {
        String[] strArray;
        strArray = str.split(" ");
        String result = strArray[0];
        int max = result.length();
        for (int i = 1; i < strArray.length; i++)
            if (strArray[i].length() > max)
                result = strArray[i];
                max = result.length();
        return result;
    }

    public String findWordSub(String str) {
        String result = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                result = tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length()>m) result = str;
        return result;
    }

    public static void main(String[] args) {
        Se1_3 T = new Se1_3();
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();
        System.out.println(T.findWordSub(input));
    }
}
