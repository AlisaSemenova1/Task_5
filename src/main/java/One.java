import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class One {
    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(6, 2, 4, 3, 5, 1, 7));
        System.out.println(listOne);
        Collections.sort(listOne);
        System.out.println(listOne);
        Collections.sort(listOne, Collections.reverseOrder());
        System.out.println(listOne);
        listOne.clear();
        System.out.println(listOne);
    }
}
