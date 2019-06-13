package ch.swisscom.Timetracking;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrakerRepository extends CrudRepository<Traker, Long>{

}
