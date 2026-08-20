package dao;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ProductDao {
    private final Map<String, Product> storage = new ConcurrentHashMap<>();

    public void save(Product product) {
        storage.put(product.getId(), product);
    }

    public List<Product> findAll() {
        return new ArrayList<>(storage.values());
    }

    public Optional<Product> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }
}