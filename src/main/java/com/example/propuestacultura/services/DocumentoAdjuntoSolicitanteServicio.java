package com.example.propuestacultura.services;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.FormatosAdjuntoSolicitante;
import com.example.propuestacultura.repositories.IFormatosAdjuntosSolicitanteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoAdjuntoSolicitanteServicio {

    @Autowired
    IFormatosAdjuntosSolicitanteRepositorio iformatosAdjuntosSolicitanteRepositorio;

    public FormatosAdjuntoSolicitante agregarFromato(FormatosAdjuntoSolicitante datosFormato) throws Exception{
        try {
            //Aplico las validaciones necesarias
            //llama al repositorio e intenta realizar la op en BD
            return this.iformatosAdjuntosSolicitanteRepositorio.save(datosFormato);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<FormatosAdjuntoSolicitante> buscarTodosFormatos()throws Exception{
        try{
            return this.iformatosAdjuntosSolicitanteRepositorio.findAll();
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
