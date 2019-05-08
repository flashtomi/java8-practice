import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        ForEachExamples forEachExample = new ForEachExamples();

        forEachExample.printOutMap(items);
        forEachExample.printOutMapWithForEach(items);
        String key = "E";
        forEachExample.findKeyInMap(items, key);

        List<String> itemList = new ArrayList<>();
        itemList.add("A");
        itemList.add("B");
        itemList.add("C");
        itemList.add("D");
        itemList.add("E");

        IForEachExamples.printOutListWithForEach(itemList);
        forEachExample.printOutListMethodReference(itemList);
        forEachExample.findKeyInList(itemList, key);
        forEachExample.filterList(itemList, key);
    }
}
