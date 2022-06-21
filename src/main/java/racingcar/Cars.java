package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private List<Car> cars;

    public Cars(String input) {

        cars = Arrays.stream(input.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public String winners() {
        Collections.sort(cars);
        int maxValue = cars.get(0).getPosition();

        return cars.stream()
                .filter(car -> car.getPosition() == maxValue)
                .map(car -> car.getName())
                .collect(Collectors.joining(","));
    }
}
