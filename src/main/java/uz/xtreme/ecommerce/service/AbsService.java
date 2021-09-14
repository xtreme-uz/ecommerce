package uz.xtreme.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.xtreme.ecommerce.domain.Auditable;
import uz.xtreme.ecommerce.service.dto.Dto;
import uz.xtreme.ecommerce.service.dto.PageTo;
import uz.xtreme.ecommerce.service.mapper.BaseMapper;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class AbsService<T extends Auditable, I extends Serializable,
        D extends Dto<I>, R extends JpaRepository<T, I>, M extends BaseMapper<T, D>> {

    protected final R repository;
    protected final M mapper;

    public PageTo getAll(Pageable pageable) {
        Page<T> all = repository.findAll(pageable);
        List<D> content = mapper.toDto(all.getContent());
        return new PageTo(all.getTotalPages(), all.getTotalElements(), content);
    }

    public D get(I id) {
        Optional<T> byId = repository.findById(id);
        if (byId.isPresent())
            return mapper.toDto(byId.get());
        else
            throw new RuntimeException("Object not found");
    }

    public D create(D dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public D update(D dto) {
        if (dto.getId() == null) {
            throw new RuntimeException("Bad request id null");
        }
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public void delete(I id) {
        repository.deleteById(id);
    }

}
