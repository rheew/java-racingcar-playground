package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    private Cars cars;

    @BeforeEach
    void setup() {
        cars = new Cars("a,b,c");
    }

    @Test
    void 문자열_콤마로_이름_구분() {
        String input = "a,b,c";

        assertThat(input.split(",")[0]).isEqualTo("a");
        assertThat(input.split(",")[1]).isEqualTo("b");
        assertThat(input.split(",")[2]).isEqualTo("c");
    }

    @Test
    void 우승자_선별() {

        assertThat(cars.winners()).isEqualTo("a,b,c");
    }
}
