package dao;

import connection.DatabaseConnection;
import lombok.AllArgsConstructor;
import model.StockMovement;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@AllArgsConstructor
@Repository
public class StockMovementDao {
    private DatabaseConnection databaseConnection;
    private final Map<String, StockMovement> storage = new ConcurrentHashMap<>();

    public void save(StockMovement movement) {
        storage.put(movement.getId(), movement);
    }

    public List<StockMovement> findByProductId(String productId) {
        List<StockMovement> result = new ArrayList<>();
        try(Connection con = databaseConnection.connectToPostgres();
            PreparedStatement pr = con.prepareStatement("SElECT stock_movement FROM product join stock_movement on product.id = stock_movement.product_id where product.id = ?")){

            pr.setString(1,productId);

            ResultSet rs = pr.executeQuery()è

            while(rs.next()){
                var S
            }
        }catch(Exception e){
            System.out.println("Error is : " + e);
        }
        return result;
    }
}
