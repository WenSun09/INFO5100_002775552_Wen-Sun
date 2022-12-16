import java.util.Collection;
import java.util.List;

public class CollectionUtil {
    public static <T> int countByProperty(Collection<T> collection, Property<T> property) {
        int cnt = 0;
        for (T element : collection)
            if (property.meetProperty(element))
                cnt += 1;
        return cnt;
    }

    public static <T> void swapByPosition(T[] a, int i, int j) {
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static <T extends Object & Comparable<? super T>> T findMax(List<? extends T> list, int begin, int end) {
        T max = list.get(begin);
        for (int i = begin + 1; i < end; ++i)
            if (max.compareTo(list.get(i)) < 0)
                max = list.get(i);
        return max;
    }
}
