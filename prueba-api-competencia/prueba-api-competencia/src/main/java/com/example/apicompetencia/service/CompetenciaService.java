package com.example.apicompetencia.service;

import com.example.apicompetencia.domain.Competencia;

import java.util.List;

public interface CompetenciaService {
    Competencia createCompetencia(Competencia competencia);
    List<Competencia> getAllCompetencias();
    Competencia modifyCompetencia(Competencia competencia);

    void deleteCompetencia(Long idCompetencia);
}
