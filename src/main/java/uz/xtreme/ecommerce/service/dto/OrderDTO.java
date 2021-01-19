package uz.xtreme.ecommerce.service.dto;

import lombok.Data;
import uz.xtreme.ecommerce.domain.OrderState;

import java.util.List;

@Data
public class OrderDTO implements DTO<Long> {

    private Long id;

    private EcUserDTO customer;

    private List<OrderItemDTO> items;

    private OrderState state;

}
