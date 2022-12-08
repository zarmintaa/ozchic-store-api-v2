package ozchicstore.api.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ozchicstore.api.entities.Profile;

@Service
public class ProfileService implements IService<Profile, Long> {
    @Override
    public ResponseEntity<Object> insert(Profile model) {
        return null;
    }

    @Override
    public ResponseEntity<Object> update(Profile model, Long aLong) {
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
