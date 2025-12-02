package com.apuliadigital.caso_studio.Repository;
import com.apuliadigital.caso_studio.Models.ModelVoloProgrammato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoloProgrammatoRepository extends MongoRepository<ModelVoloProgrammato, String> {
    ModelVoloProgrammato findByNumVolo(String numVolo);
}