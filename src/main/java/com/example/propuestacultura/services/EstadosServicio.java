package com.example.propuestacultura.services;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.repositories.IEstadosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadosServicio {

    @Autowired
    IEstadosRepositorio iEstadosRepositorio;

    //LISTAN LOS METODOS PARA ACCIONAR LA LOGICA DE NEGOCIO
    //ALMACENAR EN LA BD UN ESTADO
    public Estados agregarEstado(Estados datosEstado) throws Exception{
        try {
            //Aplico las validaciones necesarias
            //llama al repositorio e intenta realizar la op en BD
            return this.iEstadosRepositorio.save(datosEstado);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //BUSCAR TODOS LOS ESTADOS QUE HAY EN UNA BD
    public List<Estados> buscarTodosEstados()throws Exception{
        try{
            return this.iEstadosRepositorio.findAll();
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //BUSCAR UN ESTADO POR ID
    //public Estados buscarEstadoPorId(Integer id){}

    //MODIFICAR EL NOMBRE DE UN ESTADO
    //public Estados modificarEstado(Integer id, Estados datosModificar){}

    //ELIMINAR UN ESTADO DE LA BD
    //public Boolean eliminarEstado(Integer id){}


}
