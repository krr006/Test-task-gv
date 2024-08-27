import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4);

        System.out.println(countInt(list));

    }

    private static Map<Integer, Integer> countInt(List<Integer> list) {

        Map<Integer, Integer> result = new HashMap<>();

        for (Integer el : list) {
            result.put(el, result.getOrDefault(el, 0) + 1);
        }

        return result;
    }
}