package uz.xtreme.ecommerce.service;

import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.domain.Role;
import uz.xtreme.ecommerce.repository.RoleRepository;
import uz.xtreme.ecommerce.service.dto.RoleTo;
import uz.xtreme.ecommerce.service.mapper.RoleMapper;

@Service
public class RoleService extends AbsService<Role, Long, RoleTo, RoleRepository, RoleMapper> {

    public RoleService(RoleRepository repository, RoleMapper mapper) {
        super(repository, mapper);
    }
}
