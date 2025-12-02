package com.apuliadigital.caso_studio.Models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "voli_programmati")
public class ModelVoloProgrammato {
    @Id
    private String id;
    private String numVolo;
    private String partenza;
    private String arrivo;
    private String giorni;
    private String orarioPartenza;
    private String orarioArrivo;
    private String durata;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumVolo() {
        return numVolo;
    }

    public void setNumVolo(String numVolo) {
        this.numVolo = numVolo;
    }

    public String getPartenza() {
        return partenza;
    }

    public void setPartenza(String partenza) {
        this.partenza = partenza;
    }

    public String getArrivo() {
        return arrivo;
    }

    public void setArrivo(String arrivo) {
        this.arrivo = arrivo;
    }

    public String getGiorni() {
        return giorni;
    }

    public void setGiorni(String giorni) {
        this.giorni = giorni;
    }

    public String getOrarioPartenza() {
        return orarioPartenza;
    }

    public void setOrarioPartenza(String orarioPartenza) {
        this.orarioPartenza = orarioPartenza;
    }

    public String getOrarioArrivo() {
        return orarioArrivo;
    }

    public void setOrarioArrivo(String orarioArrivo) {
        this.orarioArrivo = orarioArrivo;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }
}
