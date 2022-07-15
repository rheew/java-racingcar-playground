package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    public List<Integer> scoreGenerator(int size) {
        final List<Integer> scores = new ArrayList<>();
        final Random random = new Random();
        for (int i = 0; i < size; i++) {
            scores.add(random.nextInt(10));
        }
        return scores;
    }

    public String start(int input, String name) {
        final Cars cars = new Cars(name);

        for (int i = 0; i < input; i++) {
            cars.move(scoreGenerator(cars.getCount()));
        }

        return cars.winners();
    }
}
