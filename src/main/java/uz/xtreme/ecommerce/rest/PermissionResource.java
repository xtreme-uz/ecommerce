package uz.xtreme.ecommerce.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.xtreme.ecommerce.service.PermissionService;
import uz.xtreme.ecommerce.service.dto.PageTo;
import uz.xtreme.ecommerce.service.dto.PermissionTo;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/permissions")
public class PermissionResource {
    
    private final PermissionService service;

    @GetMapping
    public ResponseEntity<PageTo> getAll(Pageable pageable) {
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PermissionTo> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<PermissionTo> create(@RequestBody PermissionTo permission) {
        return ResponseEntity.ok(service.create(permission));
    }

    @PutMapping
    public ResponseEntity<PermissionTo> update(@RequestBody PermissionTo permission) {
        return ResponseEntity.ok(service.update(permission));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    
}
