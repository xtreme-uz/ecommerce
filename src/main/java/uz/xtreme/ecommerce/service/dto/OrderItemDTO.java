package uz.xtreme.ecommerce.service.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDTO {

    private Long id;

    private OrderDTO order;

    private ProductDTO product;

    private BigDecimal quantity;

    private QuantityUnitDTO quantityUnit;

}
