public class LeetCode2303 {
    //解题思路:模拟的思路，遍历brackets内的所有数组
    public double calculateTax(int[][] brackets, int income) {
        int curCome = income;
        int  i = 0;
        double tax = 0;
        while(curCome > 0){
            if( i == 0 ){
                if(curCome - brackets[i][0] > 0){
                    tax += (double) (brackets[i][0] * brackets[i][1]) / 100 ;
                    System.out.println(tax);
                }else{
                    tax += (double) (curCome * brackets[i][1]) / 100;
                    System.out.println(tax);
                }
                curCome -= brackets[i][0];
            }else{
                //不等于0的情况
                if(curCome - (brackets[i][0] - brackets[i-1][0]) > 0 ){
                    tax += (double) ( (brackets[i][0] - brackets[i-1][0]) * brackets[i][1] ) / 100;
                    System.out.println(tax);
                }else{
                    tax += (double) (curCome * brackets[i][1]) / 100;
                    System.out.println(tax);
                }
                curCome -= (brackets[i][0] - brackets[i-1][0]);
            }
            i++;
        }
        return tax;
    }
}
