package example;

import org.junit.Test;

public class SampleTest {

    @Test
    public void acccessTheClass() {
        Class<Sample> clazz = Sample.class;
    }

    @Test
    public void instantiation() {
        Sample s = Sample.builder().build();
    }
}
