package com.salesianos.dto_tarea;

import com.salesianos.dto_tarea.model.Alumno;
import com.salesianos.dto_tarea.model.Curso;
import jakarta.annotation.PostConstruct;

public class ManinDeMentira {

    // Testing area

    @PostConstruct
    static void main() {

        // Testear crear alumnos sin datos para probar las validacines de los DTOs
        Alumno a1 = new Alumno.builder()
                .nombre("Pepe")
                .apellido1("García")
                .apellido2("López")
                .email("testing@test.com")
                .build();


        Curso c1 = new Curso.builder()
                .id(1L),
                .nombre(nombre),
        .tipo

    }

}