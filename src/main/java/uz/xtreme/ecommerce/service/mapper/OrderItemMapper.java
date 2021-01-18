package uz.xtreme.ecommerce.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.xtreme.ecommerce.domain.OrderItem;
import uz.xtreme.ecommerce.service.dto.OrderItemDTO;

import java.util.List;

@Mapper(componentModel = "spring", uses = { QuantityUnitMapper.class })
public interface OrderItemMapper {

    OrderItemMapper INSTANCE = Mappers.getMapper(OrderItemMapper.class);

    OrderItemDTO toDto(OrderItem entity);

    List<OrderItemDTO> toDto(List<OrderItem> entity);

    OrderItem toEntity(OrderItemDTO dto);

    List<OrderItem> toEntity(List<OrderItemDTO> dto);
}
