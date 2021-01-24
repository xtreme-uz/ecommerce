package uz.xtreme.ecommerce.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import uz.xtreme.ecommerce.service.RoleService;
import uz.xtreme.ecommerce.service.dto.PageDTO;
import uz.xtreme.ecommerce.service.dto.RoleDTO;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/roles")
public class RoleResource {
    
    private final RoleService service;

    @GetMapping
    public ResponseEntity<PageDTO> getAll(Pageable pageable) {
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleDTO> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<RoleDTO> create(@RequestBody RoleDTO role) {
        return ResponseEntity.ok(service.create(role));
    }

    @PutMapping
    public ResponseEntity<RoleDTO> update(@RequestBody RoleDTO role) {
        return ResponseEntity.ok(service.update(role));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    
}
