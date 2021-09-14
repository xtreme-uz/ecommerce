package uz.xtreme.ecommerce.service;

import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.domain.Permission;
import uz.xtreme.ecommerce.repository.PermissionRepository;
import uz.xtreme.ecommerce.service.dto.PermissionTo;
import uz.xtreme.ecommerce.service.mapper.PermissionMapper;

@Service
public class PermissionService extends AbsService<Permission, Long, PermissionTo, PermissionRepository, PermissionMapper> {

    public PermissionService(PermissionRepository repository, PermissionMapper mapper) {
        super(repository, mapper);
    }
}
