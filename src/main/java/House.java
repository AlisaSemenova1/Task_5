import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class House {
    public static void main(String[] args) {
        HashMap<String, Integer> tenants = new HashMap<>();
        tenants.put("Иванов Иван Иванович", 31);
        tenants.put("Петров Петр Петрович", 16);
        tenants.put("Захаров Захар Захарович", 28);
        tenants.put("Иванова Анна Ивановна", 23);
        tenants.put("Петрова Ирина Петровна", 22);
        tenants.put("Захарова Ольга Захаровна", 30);
        ArrayList<String> nameTenants = new ArrayList<>();
        for (Map.Entry entry : tenants.entrySet()) {
            if ((Integer) entry.getValue() > 18) {
                nameTenants.add(entry.getKey().toString());
            }
        }
        Collections.sort(nameTenants);
        System.out.println(nameTenants);
    }
}

