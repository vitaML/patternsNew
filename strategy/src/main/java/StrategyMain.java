import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Viktoriia_Martyniuk- on 23-Nov-16.
 */
public class StrategyMain {
    public Map.Entry<String, MainItem> chose() {
        HashMap<String, MainItem> map = new HashMap<String, MainItem>();
        HashMap<String, MainItem> mapAdd = new HashMap<String, MainItem>();
        map.put("close", new CloseItem());
        map.put("add", new AddItem());
        mapAdd.put("flat", new FlatItem());
        mapAdd.put("car", new CarItem());
        System.out.println("chose add product or close");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (Map.Entry<String, MainItem> entry : map.entrySet())
        {
            if (str.equals(entry.getKey())) {
                entry.getValue().operation();
                if (entry.getKey().equals("add"))
                {
                    System.out.println("chose flat or car");
                    str = sc.nextLine();
                    for (Map.Entry<String, MainItem> entryAdd : mapAdd.entrySet()) {
                        if (str.equals(entryAdd.getKey())) {
                            entryAdd.getValue().operation();
                            return entryAdd;
                        }
                    }
                }
                return entry;
            }
        }
        return null;
    }
}
