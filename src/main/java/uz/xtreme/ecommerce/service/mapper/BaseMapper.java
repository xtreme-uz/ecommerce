package uz.xtreme.ecommerce.service.mapper;

import uz.xtreme.ecommerce.domain.Auditable;

import java.util.List;

public interface BaseMapper<T extends Auditable, D> {

    D toDto(T entity);

    List<D> toDto(List<T> entity);

    T toEntity(D dto);

    List<T> toEntity(List<D> dto);

}
