package ro.eestec.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.eestec.model.Sedinta;

/**
 * Created by radug on 6/9/2017.
 */
@Repository
public interface SedintaRepository extends CrudRepository<Sedinta, Long> {
}
