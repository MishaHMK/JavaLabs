package com;

import com.Classes.Present;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PresentTest {

    @Test
    void estimateWeight() {
        Present test = new Present(5);
        assertEquals(21, test.estimateWeight());
    }
}