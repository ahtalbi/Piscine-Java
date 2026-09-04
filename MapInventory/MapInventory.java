import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {

    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        if (inventory == null || productId == null) {
            return -1;
        }
        return inventory.getOrDefault(productId, -1);
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        List<String> res = new ArrayList<>();
        if (inventory == null) return res;

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() != null && entry.getValue() == price) {
                res.add(entry.getKey());
            }
        }

        return res;
    }
}