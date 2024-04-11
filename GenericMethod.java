// Generic method class
class GenericMethod {
    // Generic method to print elements of HashSet and List
    public static <T> void printCollection(HashSet<T> set, List<T> list) {
        System.out.println("HashSet contains: " + set);
        System.out.println("List contains: " + list);
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage of GenericClass
        GenericClass<Integer> genericClass = new GenericClass<>();
        genericClass.add(1);
        genericClass.add(2);
        genericClass.add(3);

        System.out.println("From HashSet: " + genericClass.getFromHashSet(1));
        System.out.println("From List: " + genericClass.getFromList(1));

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Example usage of GenericMethod
        GenericMethod.printCollection(set, list);
    }
}
