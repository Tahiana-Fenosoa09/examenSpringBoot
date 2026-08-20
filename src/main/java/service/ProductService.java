package service;

import lombok.AllArgsConstructor;
import model.Product;
import model.StockMovement;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@AllArgsConstructor



    @RestController
    @RequestMapping("/products")
    public class  ProductService{
        private ProductService inventoryService;

        public void ProductController(InventoryService inventoryService) {
            this.inventoryService = inventoryService;
        }

        @PostMapping
        public ResponseEntity<Product> createProduct(@RequestBody Product product) {
            return ResponseEntity.ok(inventoryService.createProduct(product));
        }

        @GetMapping
        public ResponseEntity<List<Product>> getAllProducts() {
            return ResponseEntity.ok(inventoryService.getAllProducts());
        }

        // GET /products/{id}/stock-movements
        @GetMapping("/{id}/stock-movements")
        public ResponseEntity<List<StockMovement>> getMovementsByProduct(@PathVariable("id") String id) {
            return ResponseEntity.ok(inventoryService.getMovementsByProduct(id));
        }
    }
}
