package com.example.propuestacultura.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="propuestas")
public class Propuesta {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="id_propuesta")
   private Integer idPropuesta;

   @ManyToOne
   @JoinColumn(name="id_solicitante",referencedColumnName = "id_solicitante")
   private Solicitante solicitante;

   @ManyToOne
   @JoinColumn(name="id_estado", referencedColumnName = "id_estado")
   private Estados estado;


   private String municipio;
   private String nombrePropuesta;
   private String presentacionGeneral;
   private LocalDate fechaPresentacionPropuesta;
   private String descripcionActividades;
   private String publicoBeneficiado;
   private String entidadesAliadas;
   private String contraprestaciones;
   private Double montoTotal;
   private Double aporteComfamaMonetario;
   private String aporteComfamaEspecie;
   private Double porcentajeAporteComfama;
   private String trayectoria;




}
