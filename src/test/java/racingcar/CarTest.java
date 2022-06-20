package racingcar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void 이름제한_5자_초과일때_오류발생() {
        String name = "abcdef";

        assertThatThrownBy(() -> new Car(name)).isInstanceOf(RuntimeException.class);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:0", "4:1"}, delimiter = ':')
    void 숫자_4이상일때_전진(int score, int expect) {
        final Car test = new Car("test");
        test.forward(score);
        assertThat(test.getPosition()).isEqualTo(expect);
    }
}
