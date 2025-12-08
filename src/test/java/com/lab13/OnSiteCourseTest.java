package com.lab13;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Tests para OnSiteCourse")
public class OnSiteCourseTest {

    @BeforeAll
    static void initAll() {
        System.out.println("▶ Iniciando tests de OnSiteCourse...");
    }

    @AfterAll
    static void finishAll() {
        System.out.println("■ Finalizando tests de OnSiteCourse...");
    }

    @BeforeEach
    void init() {
        new OnSiteCourse("Java", 2, 101, 10);
    }

    @AfterEach
    void clean() {
    }

    @ParameterizedTest
    @ValueSource(ints = { 101, 102, 103 })
    void asignarAulasValidas(int room) {
        OnSiteCourse osc = new OnSiteCourse("Java", 2, room, 10);
        assertTrue(osc.room == room);
    }

    @Test
    public void testOnSiteCourseNotNull() {
        OnSiteCourse oc = new OnSiteCourse("Java", 40, 12, 30);

        assertNotNull(oc);
    }

    @Test
    public void testShowInformationOnSiteCourse() {
        OnSiteCourse oc = new OnSiteCourse("Math", 10, 23, 40);

        String expected = "Course: Math\n"
                + "Duration: 10 hours\n"
                + "Professor: unassigned\n"
                + "Room: 23\n"
                + "Max quota: 40";

        assertEquals(expected, oc.showInformation());
    }

}
