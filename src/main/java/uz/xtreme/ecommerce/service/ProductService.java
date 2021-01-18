package uz.xtreme.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.domain.Product;
import uz.xtreme.ecommerce.repository.ProductRepository;
import uz.xtreme.ecommerce.service.dto.ProductDTO;
import uz.xtreme.ecommerce.service.mapper.ProductMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public List<ProductDTO> getAll(Pageable pageable) {
        Page<Product> all = repository.findAll(pageable);
        return mapper.toDto(all.getContent());
    }

    public Product get(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Product create(Product product) {
        return repository.save(product);
    }

    public Product update(Product product) {
        return repository.save(product);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
