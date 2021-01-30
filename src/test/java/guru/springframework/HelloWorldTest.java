package guru.springframework;

public class HelloWorldTest {

    public void testGetHello() {
        JavaHelloWorld helloWorld = new JavaHelloWorld();

        assert("Hello World".equals(helloWorld.getHello()));
    }
}
