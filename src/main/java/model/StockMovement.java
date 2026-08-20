package model;

import lombok.Getter;

import java.time.Instant;
import java.util.List;

public class StockMovement {
    @Getter
    private String id;
    private Instant createdAt;
    private List<MovementType> movementTypes;
    private int quantity;

    public StockMovement(String id, Instant createdAt, MovementType movementType, int quantity, String productId) {
        this.id = id;
        this.createdAt = createdAt;
        this.quantity = quantity;

    }

    public String getProductId() {
        return id; }
}
