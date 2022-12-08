package ozchicstore.api.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ozchicstore.api.entities.User;

@Service
public class UserService implements IService<User, Long> {
    @Override
    public ResponseEntity<Object> insert(User model) {
        return null;
    }

    @Override
    public ResponseEntity<Object> update(User model, Long aLong) {
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
