package com.salesianos.dto_tarea.dto;

import com.salesianos.dto_tarea.model.Alumno;
import com.salesianos.dto_tarea.model.Curso;
import com.salesianos.dto_tarea.model.Direccion;

public record AlumnoDTO (
        String nombre,
        String apellidos,
        String email,
        Curso curso,
        Direccion direccion
){

    public static AlumnoDTO of(Alumno alumno) {
        if (alumno == null){
            return null;
        }
        if (alumno.getNombre() == null || // Al ser null, se traga las cadenas vacías y espacios en blanco. Se puede mejorar con, por ejemplo, isBlank
                alumno.getApellido1() == null ||
                alumno.getApellido2() == null ||
                alumno.getEmail() == null ||
                alumno.getCurso() == null ||
                alumno.getDireccion() == null) {
            return null;
        }

        return new AlumnoDTO(
                alumno.getNombre(),
                alumno.getApellido1() + " " + alumno.getApellido2(),
                alumno.getEmail(),
                alumno.getCurso(),
                alumno.getDireccion()

                /*
                // validaciones testing
                CollectionsUtils.isEmpty(a.getNombre()) ? null : a.getNombre(); // no interesa pues no la usamos
                alumno.getCurso() != null ? a.getCurso().getNombre() : null // hecho arriba de forma global
                 */
        );
    }


}