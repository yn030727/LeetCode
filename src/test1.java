import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = sc.nextLine();
        String a = sc.nextLine();
        int l=0,b=0,d=0,o=0;
        for (int i = 0; i<n; i++) {
            char x = a.charAt(i);
            if (x<='z'&&x>='a'){
                    l++;
                } else if (x<='Z'&&x>='A'){
                    l++;
                } else if (x<='9'&&x>='0'){
                    d++;
                } else if(x==' '){
                    b++;
                }else {
                    o++;
                }
            }
            System.out.printf("letters=%d\n",l);
            System.out.printf("blanks=%d\n",b);
            System.out.printf("digits=%d\n",d);
            System.out.printf("others=%d\n",o);
    }

}
