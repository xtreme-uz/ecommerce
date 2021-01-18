package uz.xtreme.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.xtreme.ecommerce.domain.QuantityUnit;

@Repository
public interface QuantityUnitRepository extends JpaRepository<QuantityUnit, Long> {
}
