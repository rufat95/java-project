public class Task11 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{1, 2, 3, 5, 6};

        int countArr1 = 0;
        int countArr2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            countArr1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            countArr2 += arr2[i];
        }
        System.out.println(countArr1 - countArr2);

        // I AM LEGEND
    }
}
