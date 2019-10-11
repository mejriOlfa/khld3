package com.modificationAdresse.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.modificationAdresse.model.Conseiller;

@Repository
public interface ConseillerRepository extends CrudRepository<Conseiller, Long>{

}
