package uz.xtreme.ecommerce.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.xtreme.ecommerce.domain.QuantityUnit;
import uz.xtreme.ecommerce.service.QuantityUnitService;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/quantity-units")
public class QuantityUnitResource {

    private final QuantityUnitService service;

    @GetMapping
    public ResponseEntity<Page<QuantityUnit>> getAll(Pageable pageable) {
        Page<QuantityUnit> all = service.getAll(pageable);
        return ResponseEntity.ok(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuantityUnit> get(@PathVariable Long id) {
        QuantityUnit quantityUnit = service.get(id);
        return ResponseEntity.ok(quantityUnit);
    }

    @PostMapping
    public ResponseEntity<QuantityUnit> create(@RequestBody QuantityUnit quantityUnit) {
        QuantityUnit save = service.create(quantityUnit);
        return ResponseEntity.ok(save);
    }

    @PutMapping
    public ResponseEntity<QuantityUnit> update(@RequestBody QuantityUnit quantityUnit) {
        QuantityUnit update = service.update(quantityUnit);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
