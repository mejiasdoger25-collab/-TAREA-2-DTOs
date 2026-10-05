package com.salesianos.dto_tarea;

import com.salesianos.dto_tarea.model.Alumno;
import com.salesianos.dto_tarea.model.Curso;
import jakarta.annotation.PostConstruct;

public class ManinDeMentira {

    // "Testing area al ser fake, no api rest, no entidades, etc"

    @PostConstruct
    static void main() {

        // Testear crear alumnos sin datos para probar las validacines de los DTOs
        Alumno a1 = new Alumno.builder()
                .nombre("Pepe")
                .apellido1("García")
                .apellido2("López")
                .telefono(123123123)
                .email("testing@test.com")
                .direccion(direccion)
                .curso(curso)
                .build();


        Curso c1 = new Curso.builder()
                .id(1L)
                .nombre("2º Dam")
                .tipo("Presencial")
                .tutor("Luis Miguel López Magaña")
                .aula("203")
                .build();


        Direccion d1 = Direccion.builder()
                .tipoVia("Calle")
                .linea1("Calle Mayor 15")
                .linea2("2º A")
                .cp("41001")
                .poblacion("Sevilla")
                .provincia("Sevilla")
                .build();
    }

    // Testing salida datos
    AlumnoDTO alumnoDTO = AlumnoDTO.of(alumno);
    System.out.println(alumnoDTO);

}