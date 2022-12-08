package ozchicstore.api.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ozchicstore.api.entities.Category;

@Service
public class CategoryService implements IService<Category, Long> {
    @Override
    public ResponseEntity<Object> insert(Category model) {
        return null;
    }

    @Override
    public ResponseEntity<Object> update(Category model, Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Object> find() {
        return null;
    }

    @Override
    public ResponseEntity<Object> findOne(Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Object> delete(Long aLong) {
        return null;
    }
}
