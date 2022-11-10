import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Two {
    public static void main(String[] args) {
        ArrayList<String> listTwo = new ArrayList();
        listTwo.add("один");
        listTwo.add("два");
        listTwo.add("три");
        listTwo.add("четыре");
        listTwo.add("пять");
        listTwo.add("шесть");
        System.out.println(listTwo);
        Collections.sort(listTwo);
        System.out.println(listTwo);
        Collections.sort(listTwo, Collections.reverseOrder());
        System.out.println(listTwo);
        listTwo.clear();
        System.out.println(listTwo);

    }
}
