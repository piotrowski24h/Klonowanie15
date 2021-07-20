package com.kodilla.patterns.prototype.library.singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static LoggerTest loggerTest;

    @BeforeAll
    public static void logger() throws IOException {
        loggerTest = new LoggerTest();

        FileChannel loggerTestSuite = null;
        FileChannel.open(Path.of("Log +"));
        }

        @AfterAll
    public static void closeLoggerTest() {
        loggerTest.close();
    }

    @Test
    void testGetLogger() {
        //Given & When
        Logger loggerTestSuite = null;
        String lastLog;
        lastLog = loggerTestSuite.getLastLog();
        System.out.println("last log = ");
        //Then
        assertEquals("Log",lastLog);
    }
}
