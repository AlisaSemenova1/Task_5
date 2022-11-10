import java.util.ArrayList;
import java.util.Collections;

public class Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            lottery.add(i);
        }
        System.out.println("Выпали шарики с цифрами : ");
        Collections.shuffle(lottery);
        for (int i = 0; i < 10; i++) {
            System.out.println(lottery.get(i));
        }
    }
}
