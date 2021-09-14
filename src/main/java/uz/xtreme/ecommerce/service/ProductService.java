package uz.xtreme.ecommerce.service;

import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.domain.Product;
import uz.xtreme.ecommerce.repository.ProductRepository;
import uz.xtreme.ecommerce.service.dto.ProductTo;
import uz.xtreme.ecommerce.service.mapper.ProductMapper;

@Service
public class ProductService extends AbsService<Product, Long, ProductTo, ProductRepository, ProductMapper> {

    public ProductService(ProductRepository repository, ProductMapper mapper) {
        super(repository, mapper);
    }
}
