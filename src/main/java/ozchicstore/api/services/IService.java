package ozchicstore.api.services;

import org.springframework.http.ResponseEntity;

public interface IService<T, ID> {
    ResponseEntity<Object> insert(T model);

    ResponseEntity<Object> update(T model, ID id);

    ResponseEntity<Object> find();

    ResponseEntity<Object> findOne(ID id);

    ResponseEntity<Object> delete(ID id);

}
