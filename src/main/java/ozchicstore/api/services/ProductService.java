package ozchicstore.api.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ozchicstore.api.entities.Product;

@Service
public class ProductService implements IService<Product, Long> {
    @Override
    public ResponseEntity<Object> insert(Product model) {
        return null;
    }

    @Override
    public ResponseEntity<Object> update(Product model, Long aLong) {
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
