package com.example;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertEquals;

public class CatTest {

    private final Cat cat = new Cat();

    @Test
    public void catsMeow() throws Exception {
        assertEquals("Meow!", cat.vocalise());
    }

    @Test
    public void catIsAnAnimal() throws Exception {
        assertThat(cat, instanceOf(Animal.class));

    }
}