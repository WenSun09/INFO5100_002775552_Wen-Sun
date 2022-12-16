import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // test count
        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int oddCnt = CollectionUtil.countByProperty(collection, new OddProperty());
        System.out.println("Number of odd integers = " + oddCnt);
        int primeCnt = CollectionUtil.countByProperty(collection, new PrimeProperty());
        System.out.println("Number of prime integers = " + primeCnt);

        // test swap
        Integer array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before swap: "+ Arrays.toString(array));
        System.out.println("Swap position 2 and 7");
        CollectionUtil.swapByPosition(array, 2, 7);
        System.out.println("After swap: "+ Arrays.toString(array));

        // test max
        List<Integer> list = Arrays.asList(1, 8, 2, 7, 3, 6, 4, 5);
        System.out.println("Find max integer in the range [2, 5)");
        Integer max = CollectionUtil.findMax(list, 2, 5);
        System.out.println("Max integer = " + max);
    }
}