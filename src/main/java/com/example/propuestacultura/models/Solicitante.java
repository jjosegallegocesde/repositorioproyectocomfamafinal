package com.example.propuestacultura.models;

import jakarta.persistence.*;

@Entity
@Table(name="solicitantes")
public class Solicitante {

    private Integer idSolicitante;
    private String nombreProponente;

    @ManyToOne
    @JoinColumn(name="id_tipo_documento", referencedColumnName = "id_tipo_documento")
    private TipoDocumento tipoDocumento;
    private String nombres;
    private String apellidos;

    @Column(name="numero_documento")
    private String numeroDocumento;
    private String telefonoFijo;
    private String telefonoCelular;
    private String correo;

}
