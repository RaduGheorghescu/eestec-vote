package ro.eestec.repository;

import org.springframework.data.repository.CrudRepository;
import ro.eestec.model.User;

/**
 * Created by radug on 6/9/2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
