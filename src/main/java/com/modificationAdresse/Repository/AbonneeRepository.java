package com.modificationAdresse.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.modificationAdresse.model.*;

@Repository
public interface AbonneeRepository extends CrudRepository<Abonnee, Long>{

}
