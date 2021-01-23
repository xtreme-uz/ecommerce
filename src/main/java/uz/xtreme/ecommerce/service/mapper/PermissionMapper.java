package uz.xtreme.ecommerce.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.xtreme.ecommerce.domain.Permission;
import uz.xtreme.ecommerce.service.dto.PermissionDTO;

@Mapper(componentModel = "spring")
public interface PermissionMapper extends BaseMapper<Permission, PermissionDTO> {

    PermissionMapper INSTANCE = Mappers.getMapper(PermissionMapper.class);

}
