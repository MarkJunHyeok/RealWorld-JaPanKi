package study.realworld.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {

    @Test
    @DisplayName("사용자는 돈이 0원 이하이면 안됩니다.")
    void userMoneyZeroNope() {

        assertThrows(IllegalArgumentException.class, () -> new User("준혁", 0));

    }


}