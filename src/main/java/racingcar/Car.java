package racingcar;

public class Car {

    private static final int MIN_FORWARD_SCORE = 4;
    private static final int MAX_NAME_LENGTH = 5;
    private int position;

    public Car(String name) {
        if (validationName(name)) {
            throw new RuntimeException("이름 길이가 초과했습니다.");
        }
    }

    private boolean validationName(String name) {
        return name.length() > MAX_NAME_LENGTH;
    }

    public void forward(int score) {
        if (isForward(score)) {
            return;
        }
        position += 1;
    }

    private boolean isForward(int score) {
        return score < MIN_FORWARD_SCORE;
    }

    public int getPosition() {
        return position;
    }
}
