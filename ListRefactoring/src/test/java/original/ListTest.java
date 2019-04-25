package original;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Nested;
import original.List;

public class ListTest {
    @Test
    public void test() {
        System.out.println("Test");
    }

    @Nested
    class InnerTest {
        @Test
        public void innerTest() {
            System.out.println("innerTest");
        }
    }
}
