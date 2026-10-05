package com.salesianos.dto_tarea.dto;

import com.salesianos.dto_tarea.model.Alumno;

public record GetAlumnoDetailsDto(
        Long id,
        String nombre,
        String apellido1,
        String apellido2,
        String email
) {

    // Faltan poner las validaciones de salidas de datos
    public static GetAlumnoDetailsDto of(Alumno a){
        return new GetAlumnoDetailsDto(a.getId(), a.getNombre(), a.getApellido1(), a.getApellido2(), a.getEmail());
    }
}
