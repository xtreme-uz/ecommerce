package uz.xtreme.ecommerce.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.xtreme.ecommerce.domain.Role;
import uz.xtreme.ecommerce.service.dto.RoleTo;

@Mapper(componentModel = "spring", uses = {PermissionMapper.class})
public interface RoleMapper extends BaseMapper<Role, RoleTo>  {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

}
