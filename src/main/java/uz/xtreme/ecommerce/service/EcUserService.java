package uz.xtreme.ecommerce.service;

import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.domain.EcUser;
import uz.xtreme.ecommerce.repository.EcUserRepository;
import uz.xtreme.ecommerce.service.dto.EcUserDTO;
import uz.xtreme.ecommerce.service.mapper.EcUserMapper;

@Service
public class EcUserService extends AbsService<EcUser, Long, EcUserDTO, EcUserRepository, EcUserMapper> {

    public EcUserService(EcUserRepository repository, EcUserMapper mapper) {
        super(repository, mapper);
    }

}
