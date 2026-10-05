package com.salesianos.dto_tarea.dto;

import com.salesianos.dto_tarea.model.Alumno;
import com.salesianos.dto_tarea.model.Curso;
import com.salesianos.dto_tarea.model.Direccion;

public record EditAlumnoDto(
        Long id,
        String nombre,
        String apellido1,
        String apellido2,
        String email,
        Direccion direccion, // Cambiar por las dos clases propias
        Curso curso
) {

    // Faltan poner las validacioens de entradas de datos
    public Alumno to() {
        return Alumno.builder()
                .nombre(nombre)
                .apellido1(apellido1)
                .apellido2(apellido2)
                .email(email)
                .direccion(direccion)
                .curso(curso)
                .build();
    }
}
