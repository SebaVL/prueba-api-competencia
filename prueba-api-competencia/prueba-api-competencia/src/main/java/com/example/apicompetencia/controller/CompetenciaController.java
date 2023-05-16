package com.example.apicompetencia.controller;

import com.example.apicompetencia.domain.Competencia;
import com.example.apicompetencia.service.CompetenciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/competition")
public class CompetenciaController {
    private final CompetenciaService competenciaService;

    public CompetenciaController(CompetenciaService competenciaService) {
        this.competenciaService = competenciaService;
    }

    @GetMapping
    public ResponseEntity<List<Competencia>> getAllCompetencias(){
        return new ResponseEntity<List<Competencia>>(competenciaService.getAllCompetencias(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Competencia> addCompetencia(@RequestBody Competencia competencia){
        return new ResponseEntity<Competencia>(competenciaService.createCompetencia(competencia),HttpStatus.CREATED);
    }
}
