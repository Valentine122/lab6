package ua.lviv.iot.lab6;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Remover {

    public static String deleteWordsInWhichMoreNumbersThanLetters(String inputString, int quantityOfNumbers) {
        return Remover.deleteWordsByPattern(inputString,
                "[A-Za-z]*\\d{" + quantityOfNumbers + ",}[A-Za-z,-]*");
    }

    private static String deleteWordsByPattern(String inputString, String patternString) {
        return Remover.replaceTextByPattern(inputString, "", patternString);
    }

    private static String replaceTextByPattern(String inputString, String replacement, String patternString) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.replaceAll(replacement);
    }
}