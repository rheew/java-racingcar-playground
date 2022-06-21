package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    void 점수_0에서9_생성() {

        final Game game = new Game();
        assertThat(game.scoreGenerator() < 10).isTrue();
        assertThat(game.scoreGenerator() > -1).isTrue();
    }
}
