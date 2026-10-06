package com.EjercicioAyudantia.ISoft.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor 
public class TareaRequestDTO {
    private String titulo;
    private String prioridad;
    private String fechaLimite;
}
