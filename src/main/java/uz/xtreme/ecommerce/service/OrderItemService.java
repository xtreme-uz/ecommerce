package uz.xtreme.ecommerce.service;

import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.domain.OrderItem;
import uz.xtreme.ecommerce.repository.OrderItemRepository;
import uz.xtreme.ecommerce.service.dto.OrderItemDTO;
import uz.xtreme.ecommerce.service.mapper.OrderItemMapper;

@Service
public class OrderItemService extends AbsService<OrderItem, Long, OrderItemDTO, OrderItemRepository, OrderItemMapper> {
    public OrderItemService(OrderItemRepository repository, OrderItemMapper mapper) {
        super(repository, mapper);
    }
}
