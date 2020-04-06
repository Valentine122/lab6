package ua.lviv.iot.lab6;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


class RemoverTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testDeleteWordsInWhichMoreNumbersThanLetterss() {
        int quantityOfNumbers = 2;
        String inputString = "a123m is s0mething spec1al for you b123n";

        String input = inputString + "\n" + quantityOfNumbers;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        try (Scanner scanner = new Scanner(System.in);) {
            String stringToCheck = scanner.nextLine();
            int lengthOfWord = scanner.nextInt();

            String actual = Remover.deleteWordsInWhichMoreNumbersThanLetters(stringToCheck, lengthOfWord);
            String expected = " is s0mething spec1al for you ";
            assertEquals(expected, actual);
        }
    }

    @Test
    void testDeleteWordsInWhichMoreNumbersThanLettersss() {
        int quantityOfNumbers = 3;
        String inputString = "a123m b1-2mn nm2h";

        String input = inputString + "\n" + quantityOfNumbers;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        try (Scanner scanner = new Scanner(System.in);) {
            String stringToCheck = scanner.nextLine();
            int quantityOfNum = scanner.nextInt();

            String actual = Remover.deleteWordsInWhichMoreNumbersThanLetters(stringToCheck, quantityOfNum);
            String expected = " b1-2mn nm2h";
            assertEquals(expected, actual);
        }
    }

}