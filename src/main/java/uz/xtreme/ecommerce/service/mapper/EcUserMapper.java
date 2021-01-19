package uz.xtreme.ecommerce.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.xtreme.ecommerce.domain.EcUser;
import uz.xtreme.ecommerce.service.dto.EcUserDTO;

@Mapper(componentModel = "spring")
public interface EcUserMapper extends BaseMapper<EcUser, EcUserDTO> {

    EcUserMapper INSTANCE = Mappers.getMapper(EcUserMapper.class);

}
