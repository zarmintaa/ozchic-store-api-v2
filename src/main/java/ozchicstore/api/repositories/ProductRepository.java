package ozchicstore.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ozchicstore.api.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
