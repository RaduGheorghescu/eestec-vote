package ro.eestec.repository;

import org.springframework.data.repository.CrudRepository;
import ro.eestec.model.Role;

/**
 * Created by radug on 6/9/2017.
 */
public interface RoleRepository extends CrudRepository<Role,Long> {
    Role findByName(String name);
}
