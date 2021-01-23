package uz.xtreme.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.xtreme.ecommerce.domain.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
