package study.realworld.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {

    @Test
    void 음수로_값이_들어가면_안된다() {

        assertThrows(IllegalArgumentException.class, () -> new User("준혁", 0));

    }


}