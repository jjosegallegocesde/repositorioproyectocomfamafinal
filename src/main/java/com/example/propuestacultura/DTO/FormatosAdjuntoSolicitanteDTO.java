package com.example.propuestacultura.DTO;

public class FormatosAdjuntoSolicitanteDTO {

    private String nombreInhabilidades;
    private String nombreExtraData;

    public FormatosAdjuntoSolicitanteDTO() {
    }

    public FormatosAdjuntoSolicitanteDTO(String nombreInhabilidades, String nombreExtraData) {
        this.nombreInhabilidades = nombreInhabilidades;
        this.nombreExtraData = nombreExtraData;
    }

    public String getNombreInhabilidades() {
        return nombreInhabilidades;
    }

    public void setNombreInhabilidades(String nombreInhabilidades) {
        this.nombreInhabilidades = nombreInhabilidades;
    }

    public String getNombreExtraData() {
        return nombreExtraData;
    }

    public void setNombreExtraData(String nombreExtraData) {
        this.nombreExtraData = nombreExtraData;
    }
}
