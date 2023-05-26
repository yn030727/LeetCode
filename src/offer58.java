public class offer58 {
    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg" , 2));
    }
    public static String reverseLeftWords(String s , int n){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0  ; i < n ; i++){
            sb.append(s.charAt(i));
        }
        return sb.substring(n).toString();
    }
}
