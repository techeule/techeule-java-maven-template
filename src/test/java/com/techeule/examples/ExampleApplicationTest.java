package com.techeule.examples;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ExampleApplicationTest {

    @Test
    void simpleTest() {
        Assertions.assertThat(1 + 1).isEqualTo(4 / 2);
    }
}