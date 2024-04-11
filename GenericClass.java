import java.util.*;

// Generic class
class GenericClass<T> {
    private HashSet<T> hashSet;
    private List<T> list;

    public GenericClass() {
        hashSet = new HashSet<>();
        list = new ArrayList<>();
    }

    public void add(T t) {
        hashSet.add(t);
        list.add(t);
    }

    public T getFromHashSet(int index) {
        Iterator<T> iterator = hashSet.iterator();
        for (int i = 0; i < index; i++) {
            iterator.next();
        }
        return iterator.next();
    }

    public T getFromList(int index) {
        return list.get(index);
    }
}
