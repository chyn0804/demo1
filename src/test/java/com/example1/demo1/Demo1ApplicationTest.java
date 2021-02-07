package com.example1.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Demo1ApplicationTest {
    @Test
    public void contextLoads() {

        assertThat("actual", is("actual"));
        assertThat("actual", is("actual"));
    }
}