package com.EjercicioAyudantia.ISoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EjercicioAyudantia.ISoft.dto.TareaRequestDTO;
import com.EjercicioAyudantia.ISoft.model.Tarea;
import com.EjercicioAyudantia.ISoft.service.TareaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController 
@RequestMapping("/tasks")
public class TareaController {
    final private TareaService service;
    
    public TareaController(TareaService service){
        this.service = service;
    }

    @PostMapping("")
    public ResponseEntity<Tarea> postNuevaTarea(
        @RequestBody TareaRequestDTO dto
    ) {
        // Genera la nueva tarea y la almacena en la lista
        return null;
    }

    @GetMapping("")
    public List<ResponseEntity<Tarea>> getListaTareas(
        @RequestParam(required = false) String prioridad,
        @RequestParam(required = false) String titulo,
        @RequestParam(required = false) String fechaLimite
    ) {
        // Agregar los parametros y verificar que estos sean validos
        return null;
    }
    
    @PatchMapping("/{id}/complete")
    public ResponseEntity<Void> patchTareaCompleta(
        @PathVariable Long id
    ){
        // Buscar por id y generar el cambio a completado
        return null;
    }
}
