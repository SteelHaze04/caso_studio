package com.apuliadigital.caso_studio.Service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.apuliadigital.caso_studio.Repository.VoloOperativoRepository;
import com.apuliadigital.caso_studio.Repository.VoloProgrammatoRepository;
import com.apuliadigital.caso_studio.Models.ModelVoliOperativi;
import com.apuliadigital.caso_studio.Models.ModelVoloProgrammato;

@Service
public class VoloService {
    private final VoloOperativoRepository voloOperativoRepo;
    private final VoloProgrammatoRepository voloProgrammatoRepo;

    public VoloService(VoloOperativoRepository voloOperativoRepo, VoloProgrammatoRepository voloProgrammatoRepo) {
        this.voloOperativoRepo = voloOperativoRepo;
        this.voloProgrammatoRepo = voloProgrammatoRepo;
    }

    public ModelVoloProgrammato getFlightById(String flightId) {
        return voloProgrammatoRepo.findByNumVolo(flightId);
    }

    public List<ModelVoliOperativi> getAllOperationalFlights() {
        return voloOperativoRepo.findAll();
    }
}

