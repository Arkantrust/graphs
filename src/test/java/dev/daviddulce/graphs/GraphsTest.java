package dev.daviddulce.graphs;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GraphsTest {

    @Test
    public void truthStringTest() {

        String string = "awesome";
        assertThat(string).startsWith("awe");
        assertWithMessage("Without me, it's just aweso")
                .that(string)
                .contains("me");
    }

    @Test
    public void truthListTest() {

        List<Integer> naturals = new ArrayList<>();

        naturals.add(1);
        naturals.add(2);
        naturals.add(3);
        naturals.add(4);
        naturals.add(5);

        assertThat(naturals)
                .containsExactly(1, 2, 3, 4, 5)
                .inOrder();

    }

    @Test
    public void testMain() {

        assertWithMessage("Graphs").that("Graphs").isEqualTo("Graphs");

    }

}