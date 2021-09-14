package uz.xtreme.ecommerce.service;

import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.domain.Order;
import uz.xtreme.ecommerce.domain.OrderItem;
import uz.xtreme.ecommerce.domain.OrderState;
import uz.xtreme.ecommerce.repository.OrderRepository;
import uz.xtreme.ecommerce.service.dto.*;
import uz.xtreme.ecommerce.service.exception.ObjectNotFoundException;
import uz.xtreme.ecommerce.service.mapper.OrderMapper;

import java.util.Optional;

@Service
public class OrderService extends AbsService<Order, Long, OrderTo, OrderRepository, OrderMapper> {

    private final OrderItemService orderItemService;
    private final ProductService productService;

    public OrderService(OrderRepository repository, OrderMapper mapper, OrderItemService orderItemService, ProductService productService) {
        super(repository, mapper);
        this.orderItemService = orderItemService;
        this.productService = productService;
    }

    public void addItem(OrderItemTo dto) {
        Optional<Order> byId = repository.findById(dto.getOrderId());
        Order order = byId.orElseThrow(ObjectNotFoundException::new);
        if (OrderState.NEW.compareTo(order.getState()) == 0) {
            ProductTo product = productService.get(dto.getProductId());
            if (product.getQuantity().compareTo(dto.getQuantity()) < 0)
                throw new RuntimeException("there is no product in such quantities");
            orderItemService.create(dto);
        } else {
            throw new RuntimeException("order is not accessible to add item");
        }
    }

    public void deleteItem(Long id, Long itemId) {
        Optional<Order> byId = repository.findById(id);
        Order order = byId.orElseThrow(ObjectNotFoundException::new);
        if (OrderState.NEW.compareTo(order.getState()) == 0) {
            Optional<OrderItem> removable = order.getItems().stream()
                    .filter(orderItem -> orderItem.getId().equals(itemId)).findFirst();
            order.getItems().remove(removable.orElseThrow(() -> new ObjectNotFoundException("removable item not found")));
            repository.save(order);
        } else {
            throw new RuntimeException("order is not accessible to add item");
        }
    }
}
