package racingcar;

public class Car {

    private final int MAX_LENGTH = 5;

    public Car(String name) {
        if (validationName(name)) {
            throw new RuntimeException("이름 길이가 초과했습니다.");
        }
    }

    private boolean validationName(String name) {
        return name.length() > MAX_LENGTH;
    }
}
