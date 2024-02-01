package com.example.propuestacultura.models;

import jakarta.persistence.*;

@Entity
@Table(name="tipo_documento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo_documento")
    private Integer idTipoDocumento;
    private String tipoDocumento;

}
