package com.example.propuestacultura.repositories;

import com.example.propuestacultura.models.FormatosAdjuntoSolicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormatosAdjuntosSolicitanteRepositorio extends JpaRepository<FormatosAdjuntoSolicitante,Integer> {
}
