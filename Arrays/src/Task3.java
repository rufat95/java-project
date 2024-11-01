public class Task3 {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j < prices.length; j++) {
//                if(prices[i] < prices[j]){
//                    return prices[i];
//                }
                if (prices[i] > prices[j]){
                    return prices[i];
                }
            }
        }
        return 0;
    }
}
