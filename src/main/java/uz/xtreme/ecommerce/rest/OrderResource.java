package uz.xtreme.ecommerce.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.xtreme.ecommerce.domain.Order;
import uz.xtreme.ecommerce.service.OrderService;
import uz.xtreme.ecommerce.service.dto.OrderDTO;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/orders")
public class OrderResource {
    
    private final OrderService service;

    @GetMapping
    public ResponseEntity<List<OrderDTO>> getAll(Pageable pageable) {
        //TODO add pagination info
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<OrderDTO> create(@RequestBody OrderDTO dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping
    public ResponseEntity<Order> update(@RequestBody Order order) {
        Order update = service.update(order);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    //TODO add Item

    //TODO delete Item

    //TODO pay for order

}
