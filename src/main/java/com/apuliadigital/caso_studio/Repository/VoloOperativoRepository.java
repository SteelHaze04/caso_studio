package com.apuliadigital.caso_studio.Repository;
import com.apuliadigital.caso_studio.Models.ModelVoliOperativi;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoloOperativoRepository extends MongoRepository<ModelVoliOperativi, String> {
    ModelVoliOperativi findByNumVolo(String numVolo);
}


