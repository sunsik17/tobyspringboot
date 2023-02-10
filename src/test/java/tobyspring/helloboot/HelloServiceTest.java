package tobyspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloServiceTest {
    @Test
    void simpleHelloService() {
        //given
        SimpleHelloService helloService = new SimpleHelloService();
        //when
        //then
        String ret = helloService.sayHello("Test");

        Assertions.assertThat(ret).isEqualTo("Hello Test");
    }

    @Test
    void helloDecorator() {
        //given
        HelloDecorator decorator = new HelloDecorator(name -> name);
        String test = decorator.sayHello("Test");
        //when
        //then
        Assertions.assertThat(test).isEqualTo("*Test*");
    }
}