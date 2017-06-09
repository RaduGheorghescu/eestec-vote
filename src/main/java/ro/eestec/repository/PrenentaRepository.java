package ro.eestec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ro.eestec.model.Prezenta;

/**
 * Created by radug on 6/9/2017.
 */
public interface PrenentaRepository extends CrudRepository<Prezenta,Long>{
}
