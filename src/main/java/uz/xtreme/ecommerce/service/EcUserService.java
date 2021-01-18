package uz.xtreme.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.xtreme.ecommerce.repository.EcUserRepository;

@Service
@RequiredArgsConstructor
public class EcUserService {

    private final EcUserRepository repository;

    //TODO CRUD operation
}
