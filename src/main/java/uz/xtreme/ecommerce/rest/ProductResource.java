package uz.xtreme.ecommerce.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.xtreme.ecommerce.service.ProductService;
import uz.xtreme.ecommerce.service.dto.PageDTO;
import uz.xtreme.ecommerce.service.dto.ProductDTO;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductResource {

    private final ProductService service;

    @GetMapping
    public ResponseEntity<PageDTO> getAll(Pageable pageable) {
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO product) {
        return ResponseEntity.ok(service.create(product));
    }

    @PutMapping
    public ResponseEntity<ProductDTO> update(@RequestBody ProductDTO product) {
        return ResponseEntity.ok(service.update(product));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
