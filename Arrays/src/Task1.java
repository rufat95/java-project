import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
//        int[] nums = {2,2,1,1,5,5,5,5,5,1,2,2};
//        System.out.println(majorityElement(nums));
//
//        System.out.println(mEle(nums));
        int a = 5;
        int b = 2;

        System.out.println(task(a,b));
    }

    public static int mEle(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    public static int majorityElement(int[] nums) {

        int result = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > result){
                return nums[i];
            }
        }
        return 1;
    }

    public static int task(int a, int b){
        if(a<=0) return b;
        return task(a-2,b+a);
    }

}


