import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {-1,0,3,5,11,9};
        System.out.println(search(a, 9));

    }

    public static int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

//    public static int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{};
//    }

//    public static int removeDuplicates(int[] a) {
//        int count = 1;
//        int number = a.length;
//
//        for (int i = 1; i < a.length; i++) {
//            if(a[i] == a[i-1]){
//                number--;
//            }else {
//                a[count++] = a[i];
//            }
//        }
//        return number;
//    }
}