package com.apuliadigital.caso_studio.Models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

@Document(collection = "voli_operativi")
public class ModelVoliOperativi {
    @Id
    private String id;
    private String numVolo;
    private Date data;
    private String stato;
    private String gate;
    private String aeromobile;
    private List<Personale> personale;

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getAeromobile() {
        return aeromobile;
    }

    public void setAeromobile(String aeromobile) {
        this.aeromobile = aeromobile;
    }

    public List<Personale> getPersonale() {
        return personale;
    }

    public void setPersonale(List<Personale> personale) {
        this.personale = personale;
    }
}

