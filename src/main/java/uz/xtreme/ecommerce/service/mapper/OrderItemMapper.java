package uz.xtreme.ecommerce.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.xtreme.ecommerce.domain.OrderItem;
import uz.xtreme.ecommerce.service.dto.OrderItemDTO;

@Mapper(componentModel = "spring")
public interface OrderItemMapper extends BaseMapper<OrderItem, OrderItemDTO> {

    OrderItemMapper INSTANCE = Mappers.getMapper(OrderItemMapper.class);

}
