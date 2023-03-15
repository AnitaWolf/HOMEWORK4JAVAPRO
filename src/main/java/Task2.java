import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    /**
     * Task 2.
     * Given a non-empty array of integers nums,
     * every element appears twice except for one.
     * Find that single one.
     * Задание 2.
     * Дан непустой массив целых чисел nums,
     * каждый элемент появляется дважды,
     * за исключением одного.
     * Найди этот единственный элемент.*/

    public static void main(String[] args) {
        int[] arr = {6, 8, 3, 8, 6};
        System.out.println(findOfUniqueElement(arr));
    }
    public static int findOfUniqueElement(int[] array) {
        int uniqueElement = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueElement = array[i];
                break;
            }
        }
        return uniqueElement;
    }
}