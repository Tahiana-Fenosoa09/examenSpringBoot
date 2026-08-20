package dao;

// StockMovementDao.java
import model.StockMovement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StockMovementDao {
    private final Map<String, StockMovement> storage = new ConcurrentHashMap<>();

    public void save(StockMovement movement) {
        storage.put(movement.getId(), movement);
    }

    public List<StockMovement> findByProductId(String productId) {
        List<StockMovement> result = new ArrayList<>();
        for (StockMovement movement : storage.values()) {
            if (movement.getProductId().equals(productId)) {
                result.add(movement);
            }
        }
        return result;
    }
}
