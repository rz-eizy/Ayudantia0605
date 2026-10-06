package com.EjercicioAyudantia.ISoft.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.EjercicioAyudantia.ISoft.dto.TareaRequestDTO;
import com.EjercicioAyudantia.ISoft.model.Tarea;

@Service 
public class TareaService {
    private List<Tarea> tasks = new ArrayList<>();

    public Tarea generarTarea(TareaRequestDTO dto){
        return null;
    }

    private List<Tarea> listarTareas(String prioridad, String titulo, String fechaLimite){
        return null;
    }

    private Boolean cambiarEstado(Long id){
        return null;
    }

    private Boolean validarVariables(){
        return null;
    }
}
