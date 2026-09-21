package com.example.mockito5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testMainPrintsHelloWorld() {
        // 標準出力をキャプチャ
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        // main を実行
        App.main(new String[]{});

        // 出力を検証
        String output = out.toString().trim();
        assertEquals("Hello World!", output);
    }
}
