package ro.eestec.repository;

import org.springframework.data.repository.CrudRepository;
import ro.eestec.model.Statut;

/**
 * Created by radug on 6/9/2017.
 */
public interface StatutRepository extends CrudRepository<Statut, Long> {
    Statut findByDenumire(String denumire);
}
