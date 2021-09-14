package uz.xtreme.ecommerce.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.xtreme.ecommerce.service.RoleService;
import uz.xtreme.ecommerce.service.dto.PageTo;
import uz.xtreme.ecommerce.service.dto.RoleTo;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/roles")
public class RoleResource {
    
    private final RoleService service;

    @GetMapping
    public ResponseEntity<PageTo> getAll(Pageable pageable) {
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleTo> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<RoleTo> create(@RequestBody RoleTo role) {
        return ResponseEntity.ok(service.create(role));
    }

    @PutMapping
    public ResponseEntity<RoleTo> update(@RequestBody RoleTo role) {
        return ResponseEntity.ok(service.update(role));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    
}
