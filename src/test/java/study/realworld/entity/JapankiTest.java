package study.realworld.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class JapankiTest {

    @Test
    void 음수로_값이_들어가면_안된다() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Japanki("Test", -1, -1));

    }

}