package com.lab13;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

@DisplayName(" Tests para OnLineCourse")
public class CourseTest {

    @BeforeAll
    static void initAll() {
        System.out.println(" Iniciando tests de Course...");
    }

    @AfterAll
    static void finishAll() {
        System.out.println(" Finalizando tests de Course...");
    }

    @BeforeEach
    void init() {
        System.out.println(" Preparando instancia Course...");
        new Course("Java", 20);
    }

    @AfterEach
    void clean() {
        System.out.println(" Limpiando instancia Course...");
    }

    // Con profesor definido

    @Test
    @DisplayName(" Duración válida del curso")
    public void testDuracionValida() {
        Course c = new Course("Phyton", 8);
        assertTrue(c.getduration() > 0);
    }

  // PROVIDER
    static Stream<Arguments> courseProvider() {
        return Stream.of(
            Arguments.of("Java", 20, "Ana"),
            Arguments.of("Python", 30, "Luis"),
            Arguments.of("Web", 10, "Carla")
        );
    }

    @ParameterizedTest
    @MethodSource("courseProvider")
    public void testCourseWithParameters(String title, int duration, String professor) {

        Course oc = new Course(title, duration, professor);

        assertTrue(
                title.equals(oc.getTitle()) &&
                        duration == oc.getduration() &&
                        professor.equals(oc.getProfessor()));
        }

    // Sin profesor definido
    @ParameterizedTest
    @NullAndEmptySource
    void testConstructorConProfesorInvalido(String badProfessor) {
        assertThrows(IllegalArgumentException.class, () -> {
            new Course("Math", 40, badProfessor);
        });
    }

    @Test
    public void testConstructorTiempoClase() {
        Course c = new Course("Phyton", 8);

        assertTrue(c.getduration() > 0);
    }

    @Test
    public void testShowInformationCourse() {
        Course course = new Course("Java", 2, "Laura");

        String expected = "Course: Java\n" +
                "Duration: 2 hours\n" +
                "Professor: Laura";

        String result = course.showInformation();

        assertEquals(expected, result);
    }

}
