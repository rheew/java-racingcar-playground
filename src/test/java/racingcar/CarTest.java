package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    void 이름제한_5자_초과일때_오류발생() {
        String name = "asdfgb";

        assertThatThrownBy(() -> new Car(name)).isInstanceOf(RuntimeException.class);
    }
}
