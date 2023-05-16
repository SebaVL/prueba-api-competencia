package com.example.apicompetencia.service;

import com.example.apicompetencia.domain.Competencia;
import com.example.apicompetencia.repository.CompetenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenciaServiceImpl implements CompetenciaService{

    private final CompetenciaRepository competenciaRepository;

    public CompetenciaServiceImpl(CompetenciaRepository competenciaRepository){
        this.competenciaRepository = competenciaRepository;
    }
    @Override
    public Competencia createCompetencia(Competencia competencia){
        return competenciaRepository.save(competencia);
    }

    @Override
    public List<Competencia> getAllCompetencias() {
        return competenciaRepository.findAll();
    }
}
