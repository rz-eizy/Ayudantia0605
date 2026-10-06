package com.EjercicioAyudantia.ISoft.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
public class Tarea {
    private Long idTarea;    
    private String titulo;
    private String prioridad;
    private String fechaLimite;
    private boolean completada;
}
