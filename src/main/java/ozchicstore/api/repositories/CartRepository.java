package ozchicstore.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ozchicstore.api.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
