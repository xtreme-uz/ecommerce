package uz.xtreme.ecommerce.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.xtreme.ecommerce.service.OrderService;
import uz.xtreme.ecommerce.service.dto.OrderTo;
import uz.xtreme.ecommerce.service.dto.OrderItemTo;
import uz.xtreme.ecommerce.service.dto.PageTo;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/orders")
public class OrderResource {
    
    private final OrderService service;

    @GetMapping
    public ResponseEntity<PageTo> getAll(Pageable pageable) {
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderTo> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<OrderTo> create(@RequestBody OrderTo dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping
    public ResponseEntity<OrderTo> update(@RequestBody OrderTo order) {
        return ResponseEntity.ok(service.update(order));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping("/items")
    @ResponseStatus(HttpStatus.CREATED)
    public void addItem(@RequestBody OrderItemTo dto) {
        service.addItem(dto);
    }

    @DeleteMapping("/{id}/{itemId}")
    public void deleteItem(@PathVariable Long id, @PathVariable Long itemId) {
        service.deleteItem(id, itemId);
    }

    //TODO pay for order

}
