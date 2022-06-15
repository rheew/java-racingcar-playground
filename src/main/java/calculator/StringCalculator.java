package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String s) {
        if (isEmpty(s)) {
            return 0;
        }
        String[] result = split(s);

        return Arrays.stream(result)
                .mapToInt(num -> getParseInt(num))
                .sum();
    }

    private String[] split(String s) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);

        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(customDelimiter);
        }
        return s.split(":|,");
    }

    private int getParseInt(String num) {
        int result = Integer.parseInt(num);

        if (result < 0) {
            throw new RuntimeException();
        }
        return result;
    }

    private boolean isEmpty(String s) {
        return s == null || s.equals("");
    }

}
