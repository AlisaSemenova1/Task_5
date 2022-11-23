import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SolarSystem {
    public static void main(String[] args) {
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList("mercury", "venus", "earth", "mars",
                "jupiter", "saturn", "neptune", "uranus"));
        Collections.swap(solarSystem, solarSystem.indexOf("neptune"), solarSystem.indexOf("uranus"));
        System.out.println(solarSystem);
    }
}
