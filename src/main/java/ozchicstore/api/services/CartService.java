package ozchicstore.api.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ozchicstore.api.entities.Cart;

@Service
public class CartService implements IService<Cart, Long> {
    @Override
    public ResponseEntity<Object> insert(Cart model) {
        return null;
    }

    @Override
    public ResponseEntity<Object> update(Cart model, Long aLong) {
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
