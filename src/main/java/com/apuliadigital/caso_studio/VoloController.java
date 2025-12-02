package com.apuliadigital.caso_studio;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.apuliadigital.caso_studio.Service.VoloService;
import com.apuliadigital.caso_studio.Models.ModelVoloProgrammato;
import com.apuliadigital.caso_studio.Models.ModelVoliOperativi;

@RestController
@RequestMapping("/api")
public class VoloController {
    private final VoloService voloService;

    public VoloController(VoloService voloService) {
        this.voloService = voloService;
    }

    @GetMapping("/voli_programmati/{_id}")
    public ModelVoloProgrammato getFlight(@PathVariable String _id) {
        return voloService.getFlightById(_id);
    }

    @GetMapping("/voli_operativi")
    public List<ModelVoliOperativi> getOperationalFlights() {
        return voloService.getAllOperationalFlights();
    }
}