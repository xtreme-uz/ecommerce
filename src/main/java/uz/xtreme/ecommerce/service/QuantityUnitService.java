package uz.xtreme.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.domain.QuantityUnit;
import uz.xtreme.ecommerce.repository.QuantityUnitRepository;

@Service
@RequiredArgsConstructor
public class QuantityUnitService {

    private final QuantityUnitRepository repository;

    public Page<QuantityUnit> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public QuantityUnit get(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public QuantityUnit create(QuantityUnit product) {
        return repository.save(product);
    }

    public QuantityUnit update(QuantityUnit product) {
        return repository.save(product);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
