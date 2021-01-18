package uz.xtreme.ecommerce.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.xtreme.ecommerce.domain.Product;
import uz.xtreme.ecommerce.service.ProductService;
import uz.xtreme.ecommerce.service.dto.ProductDTO;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductResource {

    private final ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAll(Pageable pageable) {
        List<ProductDTO> all = service.getAll(pageable);
        return ResponseEntity.ok(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> get(@PathVariable Long id) {
        Product product = service.get(id);
        return ResponseEntity.ok(product);
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        Product save = service.create(product);
        return ResponseEntity.ok(save);
    }

    @PutMapping
    public ResponseEntity<Product> update(@RequestBody Product product) {
        Product update = service.update(product);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
