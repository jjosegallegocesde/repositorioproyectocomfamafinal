package com.example.propuestacultura.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="respuestas_propuestas")
public class RespuestaPropuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_respuesta_propuesta")
    private Integer idRespuestaPropuesta;

    @OneToOne
    @JoinColumn(name="id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;
    private LocalDate fechaRecepcion;
    private Boolean consultaListasPublicas;
    private String areaReceptora;
    private String negocio; //ENUM

    private String observaciones;

    private boolean seApoya;

    private String descripcionApoyo;

    private String respuesta;

    private String encargadoRespuesta;

    private String medioNotificacion;


}
