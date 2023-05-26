public class offer05 {
    public static void main(String[] args) {
        String str = "We are happy";
        replaceSpace(str);
    }

    public static String replaceSpace(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
