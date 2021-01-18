package uz.xtreme.ecommerce.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.xtreme.ecommerce.domain.QuantityUnit;
import uz.xtreme.ecommerce.service.dto.QuantityUnitDTO;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuantityUnitMapper {

    QuantityUnitMapper INSTANCE = Mappers.getMapper(QuantityUnitMapper.class);

    QuantityUnitDTO toDto(QuantityUnit entity);

    List<QuantityUnitDTO> toDto(List<QuantityUnit> entity);

    QuantityUnit toEntity(QuantityUnitDTO dto);

    List<QuantityUnit> toEntity(List<QuantityUnitDTO> dto);

}
