package study;

import org.junit.jupiter.api.Test;

import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

public class StringJoinerTest {

    @Test
    void 문자열사이에_콤마_넣기() {
        StringJoiner joiner = new StringJoiner(",");

        joiner.add("a");
        joiner.add("b");
        joiner.add("c");

        assertThat(joiner.toString()).isEqualTo("a,b,c");
    }
}
