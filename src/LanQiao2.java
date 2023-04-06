import java.io.*;
import java.util.HashMap;

public class LanQiao2 {

    static byte[] chars = { 0, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90 };

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line = in.readLine();
        int flag = 0;
        if (line.charAt(line.length() - 1) == '0') flag = 2;
        int pre = 0;
        for (int i = 0, h = line.length() - flag; i < h; i++) {
            pre = pre * 10 + (line.charAt(i) & 0xf);
            if (pre < 10) continue;
            if (pre > 26) {
                out.write(chars[pre / 10]);
                pre %= 10;
            } else if (pre > 10) {
                out.write(chars[pre]);
                pre = 0;
            }
        }
        if (pre != 0) out.write(chars[pre]);
        if (flag > 0) out.write(chars[(line.charAt(line.length() - 2) - '0') * 10]);
        out.close();
    }
}

//package test2;
//        import java.math.BigInteger;
//        import java.util.Scanner;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        char[] dict = new char[27];
//        for(int i = 1 ; i <= 26 ; i++) {
//            dict[i] = (char)('A' + i - 1);
//        }
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0 ; i < str.length() ; i++) {
//            if(str.charAt(i) == '1' || str.charAt(i) == '2' && i < str.length() - 1) {
//                //带上后面的数
//                String s2 = str.substring(i, i+2);
//                int index = Integer.valueOf(s2);
//                i++;
//                sb.append(dict[index]);
//            }else {
//                int index = Integer.valueOf(String.valueOf(str.charAt(i)));
//                sb.append(dict[index]);
//            }
//        }
//        System.out.println(sb.toString());
//    }
//}
