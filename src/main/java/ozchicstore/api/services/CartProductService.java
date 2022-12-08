package ozchicstore.api.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ozchicstore.api.entities.CartProduct;

@Service
public class CartProductService implements IService<CartProduct, Long> {
    @Override
    public ResponseEntity<Object> insert(CartProduct model) {
        return null;
    }

    @Override
    public ResponseEntity<Object> update(CartProduct model, Long aLong) {
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
