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
}
