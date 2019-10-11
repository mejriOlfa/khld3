package com.modificationAdresse.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.modificationAdresse.model.Adresse;

@Repository
public interface AdresseRepository extends CrudRepository<Adresse, Long> {

}
