import java.util.HashMap;

public class DogsAndCatsHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> cats = new HashMap<>();
        cats.put("Васька", 2);
        cats.put("Мурка", 3);
        cats.put("Том", 6);

        HashMap<String, Integer> dogs = new HashMap<>();
        dogs.put("Чарли", 7);
        dogs.put("Макс", 4);
        dogs.put("Герда", 7);
        dogs.put("Белла", 9);

        HashMap<String, Integer> catsAnDdDogs = new HashMap<>();
        catsAnDdDogs.putAll(cats);
        catsAnDdDogs.putAll(dogs);
        System.out.println(catsAnDdDogs);
    }
}
