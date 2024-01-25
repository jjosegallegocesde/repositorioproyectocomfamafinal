package com.example.propuestacultura.models;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="notificaciones")
public class Notificaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notificacion")
    private Integer idNotificacion;

    @ManyToOne
    @JoinColumn(name="id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;
    private LocalDate fechaNotificacion;
    private String mensajeNotificacion;
    private String observaciones;

}
