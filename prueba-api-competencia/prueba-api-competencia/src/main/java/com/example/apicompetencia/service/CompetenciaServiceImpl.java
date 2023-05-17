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

    @Override
    public Competencia modifyCompetencia(Competencia competencia){
        Competencia competenciaToUpdate = competenciaRepository.findById(competencia.getIdCompetencia()).orElse(null);
        if(competenciaToUpdate != null){
            competenciaToUpdate.setNombreCompetencia(competencia.getNombreCompetencia());
            competenciaToUpdate.setFechaInicio(competencia.getFechaInicio());
            competenciaToUpdate.setFechaFin(competencia.getFechaFin());
            return competenciaRepository.save(competenciaToUpdate);
        }else {
            return null;
        }
    }

    @Override
    public void deleteCompetencia(Long idCompetencia){
        competenciaRepository.deleteById(idCompetencia);
    }
}
