package racingcar;

import java.util.Random;

public class Game {


    public int scoreGenerator() {
        final Random random = new Random();
        return random.nextInt(10);
    }
}
