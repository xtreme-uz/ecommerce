package uz.xtreme.ecommerce.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.xtreme.ecommerce.domain.Order;
import uz.xtreme.ecommerce.service.dto.OrderDTO;

import java.util.List;

@Mapper(componentModel = "spring", uses = { OrderItemMapper.class })
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO toDto(Order entity);

    List<OrderDTO> toDto(List<Order> entity);

    Order toEntity(OrderDTO dto);

    List<Order> toEntity(List<OrderDTO> dto);

}
