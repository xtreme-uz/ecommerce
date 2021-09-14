package uz.xtreme.ecommerce.service.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemTo implements Dto<Long> {

    private Long id;

    private Long orderId;

    private Long productId;

    private BigDecimal quantity;

}
