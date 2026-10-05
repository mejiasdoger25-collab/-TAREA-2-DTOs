package com.salesianos.dto_tarea.dto;

import com.salesianos.dto_tarea.model.Alumno;
import com.salesianos.dto_tarea.model.Curso;
import com.salesianos.dto_tarea.model.Direccion;

public record GetAllAlumosDto(
        Long id,
        String nombre,
        String email
) {

    // Falta poner la valicación de salida de datos
    public static GetAllAlumosDto of(Alumno a, Curso c) {
        return new GetAllAlumosDto(a.getId(), a.getNombre(), a.getEmail());
    }
}