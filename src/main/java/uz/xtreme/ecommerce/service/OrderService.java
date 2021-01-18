package uz.xtreme.ecommerce.service;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.domain.Order;
import uz.xtreme.ecommerce.repository.OrderRepository;
import uz.xtreme.ecommerce.service.dto.OrderDTO;
import uz.xtreme.ecommerce.service.mapper.OrderMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    
    private final OrderRepository repository;
    private final OrderMapper mapper;

    public List<OrderDTO> getAll(Pageable pageable) {
        Page<Order> all = repository.findAll(pageable);
        return mapper.toDto(all.getContent());
    }

    public OrderDTO get(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    public OrderDTO create(OrderDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public Order update(Order order) {
        return repository.save(order);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
