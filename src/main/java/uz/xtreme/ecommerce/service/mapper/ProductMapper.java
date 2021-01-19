package uz.xtreme.ecommerce.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.xtreme.ecommerce.domain.Product;
import uz.xtreme.ecommerce.service.dto.ProductDTO;

@Mapper(componentModel = "spring")
public interface ProductMapper extends BaseMapper<Product, ProductDTO> {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

}
