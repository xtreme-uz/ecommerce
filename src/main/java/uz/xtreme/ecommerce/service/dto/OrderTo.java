package uz.xtreme.ecommerce.service.dto;

import lombok.Data;
import uz.xtreme.ecommerce.domain.OrderState;

import java.util.List;

@Data
public class OrderTo implements Dto<Long> {

    private Long id;

    private UserTo customer;

    private List<OrderItemTo> items;

    private OrderState state;

}
