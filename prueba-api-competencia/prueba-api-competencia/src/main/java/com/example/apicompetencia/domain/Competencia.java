package com.example.apicompetencia.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@Entity
@Table(name= "competencias")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Competencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompetencia;

    @Column(name = "nombreCompetencia", nullable = false)
    private String nombreCompetencia;

    @Column(name = "fechaInicio", nullable = false)
    private String fechaInicio;

    @Column(name = "fechaFin", nullable = false)
    private String fechaFin;


}
