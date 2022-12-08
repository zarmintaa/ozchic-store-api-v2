package ozchicstore.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ozchicstore.api.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
