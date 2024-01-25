package com.example.propuestacultura.models;

import jakarta.persistence.*;

@Entity
@Table(name="formatos_adjuntos_solicitante")
public class FormatosAdjuntoSolicitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_adjunto_solicitante")
    private Integer idAdjuntoSolicitante;

    @OneToOne
    @JoinColumn(name="id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;
    private String nombreFormatoInhabilidades;
    private String extraDatas;

}
