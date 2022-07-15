package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    private Cars cars;

    @BeforeEach
    void setup() {
        cars = new Cars("a,b,c");

        List<Integer> scores = Arrays.asList(1, 4, 9);
        cars.move(scores);
    }

    @Test
    void 문자열_콤마로_이름_구분() {
        String input = "a,b,c";

        assertThat(input.split(",")[0]).isEqualTo("a");
        assertThat(input.split(",")[1]).isEqualTo("b");
        assertThat(input.split(",")[2]).isEqualTo("c");
    }

    @Test
    void 첫번째_자동차_위치_가져오기() {
        assertThat(cars.getPosition(0)).isEqualTo(0);
    }

    @Test
    void 조건맞는_자동차들_전진() {
        // 일급 컬렉션에서 각 객체 값을 가져오는 것을 허용하지 않는다
        // 대신 메서드를 이용해 각 객체의 특정 값을 가져오는 것으로 객체들의 값을 확인 할 수 있다.

        assertThat(cars.getPosition(0)).isEqualTo(0);
        assertThat(cars.getPosition(1)).isEqualTo(1);
        assertThat(cars.getPosition(2)).isEqualTo(1);
    }

    @Test
    void 우승자_선별() {

        assertThat(cars.winners()).isEqualTo("b,c");
    }

    @Test
    void 자동차_갯수_출력() {
        assertThat(cars.getCount()).isEqualTo(3);
    }
}
