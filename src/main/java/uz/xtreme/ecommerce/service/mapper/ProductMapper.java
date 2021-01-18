package uz.xtreme.ecommerce.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.xtreme.ecommerce.domain.Product;
import uz.xtreme.ecommerce.service.dto.ProductDTO;

import java.util.List;

@Mapper(componentModel = "spring", uses = { QuantityUnitMapper.class })
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDto(Product entity);

    List<ProductDTO> toDto(List<Product> entity);

    Product toEntity(ProductDTO dto);

    List<Product> toEntity(List<ProductDTO> dto);

}
