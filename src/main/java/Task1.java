import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /**
     * Дан целочисленный массив nums,
     * отсортированный в порядке неубывания,
     * удалите дубликаты на месте таким образом,
     * чтобы каждый уникальный элемент появлялся
     * только один раз. Относительный порядок элементов
     * должен быть сохранен неизменным.*/
    public static int findLengthOfSortedPartOfArray(ArrayList<Integer> array) {

        int firstPointer = 0;
        int secondPointer = 0;
        int size = array.size();
        while (firstPointer < size && secondPointer < size) {
            if (array.get(firstPointer) == array.get(secondPointer)) {
                secondPointer++;
            } else {
                firstPointer++;
                array.set(firstPointer,array.get(secondPointer));
            }
        }
        firstPointer++;
        return firstPointer;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(0,0,1,1,1,2,2,3,3,4));
        System.out.println("Length of sorted part: "+findLengthOfSortedPartOfArray(list));

    }
}
