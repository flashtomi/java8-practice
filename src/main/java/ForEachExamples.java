import java.util.List;
import java.util.Map;

class ForEachExamples implements IForEachExamples{

    public void printOutMapWithForEach(Map<String, Integer> items) {
        items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
    }

    public void findKeyInMap(Map<String, Integer> items, String key) {
        items.forEach((k, v) -> {
            System.out.println("Item : " + k + " Count : " + v);
            if (key.equals(k)) {
                System.out.println("Hello " + key );
            }
        });
    }

    public void printOutListMethodReference(List<String> itemList) {
        itemList.forEach(System.out::println);
    }

    public void findKeyInList(List<String> itemList , String key) {
        itemList.forEach(item -> {
            if (key.equals(item)) {
                System.out.println(item);
            }
        });
    }

    public void filterList(List<String> itemList, String key) {
        itemList.stream()
                .filter(item -> item.contains(key))
                .forEach(System.out::println);
    }
}
