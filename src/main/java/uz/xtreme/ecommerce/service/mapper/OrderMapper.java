package uz.xtreme.ecommerce.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.xtreme.ecommerce.domain.Order;
import uz.xtreme.ecommerce.service.dto.OrderTo;

@Mapper(componentModel = "spring", uses = { OrderItemMapper.class })
public interface OrderMapper extends BaseMapper<Order, OrderTo> {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

}
