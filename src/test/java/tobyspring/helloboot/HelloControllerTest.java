package tobyspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void helloController() {
        //given
        HelloController helloController = new HelloController(name -> name);
        String ret = helloController.hello("Test");
        //when
        //then
        Assertions.assertThat(ret).isEqualTo("Test");
    }

    @Test
    void failsHelloController() {
        //given
        HelloController helloController = new HelloController(name -> name);
        //when
        //then
        Assertions.assertThatThrownBy(() -> {
            helloController.hello(null);
        }).isInstanceOf(IllegalArgumentException.class);

        Assertions.assertThatThrownBy(() -> {
            helloController.hello("");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}