package uz.xtreme.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.xtreme.ecommerce.domain.Order;
import uz.xtreme.ecommerce.domain.OrderState;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findByIdAndState(Long id, OrderState state);

}
