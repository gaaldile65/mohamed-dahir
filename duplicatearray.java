import java.util.Arrays;
import java.util.LinkedHashSet;
public class duplicatearray {

        public static void main(String[] args) {
            int[] inputArray = {1, 2, 2, 3, 4, 4, 5};
            int[] outputArray = removeDuplicates(inputArray);

            System.out.println(Arrays.toString(outputArray));
        }

        public static int[] removeDuplicates(int[] arr) {
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for (int num : arr) {
                set.add(num);
            }

            int[] result = new int[set.size()];
            int i = 0;
            for (int num : set) {
                result[i++] = num;
            }

            return result;
        } 
}
