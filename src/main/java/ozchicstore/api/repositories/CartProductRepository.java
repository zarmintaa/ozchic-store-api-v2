package ozchicstore.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ozchicstore.api.entities.CartProduct;

@Repository
public interface CartProductRepository extends JpaRepository<CartProduct, Long> {
}
