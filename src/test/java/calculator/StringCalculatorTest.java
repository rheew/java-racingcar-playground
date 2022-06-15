package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void 빈문자열_입력시_0_반환() {
        assertThat(stringCalculator.add("")).isEqualTo(0);
        assertThat(stringCalculator.add(null)).isEqualTo(0);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:1", "9:9"}, delimiter = ':')
    void 숫자입력시_그대로_반환(String input, int expect) {
        assertThat(stringCalculator.add(input)).isEqualTo(expect);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2:3", "9,2:11"}, delimiter = ':')
    void 기본_구분자로_합_반환(String input, int expect) {
        assertThat(stringCalculator.add(input)).isEqualTo(expect);
    }

    @Test
    void 커스텀_구분자로_합_반환() {
        String input = "//#\n9#2";
        assertThat(stringCalculator.add(input)).isEqualTo(11);
    }

    @Test
    void 커스텀_구분자_찾기() {
        String s = "//$\n123";
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);
        String customDelimiter = null;

        if (m.find()) {
            customDelimiter = m.group(1);
        }
        assertThat(customDelimiter).isEqualTo("$");
    }

    @Test
    void 음수면_예외발생() {
        assertThatThrownBy(() ->
            stringCalculator.add("-1,2,1")).isInstanceOf(RuntimeException.class);
    }
}
