package com.example.propuestacultura.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="proponentes")
public class Proponente {

    private Integer proponente_id;
    private String nombre_proponente;
    private String trayectoria;
    private Integer id_representante;
    private Integer id_tipo_proponente;

}
