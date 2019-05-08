import java.util.List;
import java.util.Map;

public interface IForEachExamples {
    default void printOutMap(Map<String, Integer> items) {
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }
    }

    void printOutMapWithForEach(Map<String, Integer> items);
    void findKeyInMap(Map<String, Integer> items, String key);

    static void printOutListWithForEach(List<String> itemList) {
        itemList.forEach(item -> System.out.println(item));
    }

    void printOutListMethodReference(List<String> itemList);
    void findKeyInList(List<String> itemList , String key);
    void filterList(List<String> itemList, String key);
}
