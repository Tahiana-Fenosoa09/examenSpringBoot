package model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode
@ToString
public class Product {
    private String id ;
    private String name;
    private String description;
    private BigDecimal unitPrice;

    public Product(String id, String name, String description, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = price;
    }

    public BigDecimal getPrice() { return unitPrice; }

    public void setPrice(BigDecimal price) { this.unitPrice = price; }


}
