public class Day2Program6 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 6, 2};
        int value = 6;

        int count = 0;

        for (int num : arr) {
            if (num != value) {
                count++;
            }
        }

        System.out.println("The length of the new array is: " + count);
    }
}