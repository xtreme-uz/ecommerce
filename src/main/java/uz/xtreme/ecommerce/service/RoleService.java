package uz.xtreme.ecommerce.service;

import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.domain.Role;
import uz.xtreme.ecommerce.repository.RoleRepository;
import uz.xtreme.ecommerce.service.dto.RoleDTO;
import uz.xtreme.ecommerce.service.mapper.RoleMapper;

@Service
public class RoleService extends AbsService<Role, Long, RoleDTO, RoleRepository, RoleMapper> {

    public RoleService(RoleRepository repository, RoleMapper mapper) {
        super(repository, mapper);
    }
}
