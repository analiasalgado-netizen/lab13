package com.lab13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Tests para OnSiteCourse")
public class OnlineCourseTest {

    private OnlineCourse online;

    @BeforeAll
    static void initAll() {
        System.out.println("▶ Iniciando tests de OnlineCourse...");
    }

    @AfterAll
    static void finishAll() {
        System.out.println("■ Finalizando tests de OnlineCourse...");
    }

    @BeforeEach
    void init() {
        System.out.println("Preparando OnlineCourse...");
        online = new OnlineCourse("Java", 2, "Moodle");
    }

    @AfterEach
    void clean() {
        System.out.println("Limpiando OnlineCourse...");
        online = null;
    }

    
    @Test
    @DisplayName("Plataforma válida")
    void testPlatform() {
        assertTrue(online.getPlatform().equals("Moodle"));
    }

    static Stream<Arguments> courseProvider() {
        return Stream.of(
                Arguments.of("Java", 2, "Moodle"),
                Arguments.of("C++", 4, "CREA"),
                Arguments.of("Asembler", 3, "Google Class"));
    }

    @ParameterizedTest
    @CsvSource({
            "Java, 2, Moodle",
            "C++, 4, CREA",
            "Asembler, 3, Google Class"
    })
    @DisplayName("Crear OnlineCourse con múltiples datos usando CsvSource")
    void testOnlineCourseWithParameters(String title, int duration, String platform) {

        OnlineCourse oc = new OnlineCourse(title, duration, platform);

        assertTrue(
                title.equals(oc.getTitle()) &&
                        duration == oc.getduration() &&
                        platform.equals(oc.getPlatform()));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Zoom", "Teams", "Google Classroom" })
    void testPlataformaInvalida(String wrongPlatform) {
        OnlineCourse oc = new OnlineCourse("Java", 2, "Moodle");
        assertTrue(!oc.getPlatform().equals(wrongPlatform));
    }

    @Test
    public void testShowInformationOnlineCourse() {
        OnlineCourse oc = new OnlineCourse("Java", 2, "Moodle");

        String expected = "Course: Java\n"
                + "Duration: 2 hours\n"
                + "Professor: unassigned\n"
                + "Platform: Moodle";

        String result = oc.showInformation();

        assertEquals(expected, result);
    }

}
