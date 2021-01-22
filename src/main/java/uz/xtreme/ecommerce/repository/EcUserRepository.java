package uz.xtreme.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.xtreme.ecommerce.domain.EcUser;

import java.util.Optional;

@Repository
public interface EcUserRepository extends JpaRepository<EcUser, Long> {
    Optional<EcUser> findByUsername(String username);
}
