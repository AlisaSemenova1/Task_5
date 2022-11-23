import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinAndMaxNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> listFour = new ArrayList<>(Arrays.asList(12, 6, 14, 31, 59, 110, 27));
        System.out.println(Collections.min(listFour));
        System.out.println(Collections.max(listFour));
    }
}
