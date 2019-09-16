package ibiz.example.java.jupiter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Junit5Test {

    private Junit5 junit5;

    @BeforeEach
    void setUp() {
        junit5 = new Junit5();
    }

    @Test
    @Disabled
    @DisplayName("assertEquals 테스트")
    void assertEquals테스트() {
        int add1 = junit5.add(1, 2);
        int add2 = junit5.add(3, 4);
        assertEquals(add1, 3);
        assertEquals(add2, 7);
    }

    @Test
    @Disabled
    @DisplayName("assertAll 테스트")
    void assertAll() {
        Assertions.assertAll(
                () -> assertEquals(4, junit5.add(1, 2)), () -> assertEquals(7, junit5.add(3, 4)));
    }

    @Test
    @Disabled
    @Tag("slow")    // JUnit Platform은 테스트 대상을 고를 때 이 태그를 이용한다. 테스트에 포함하거나 제외시킬 태그를 선택 할 수 있다.
    @DisplayName("assumingThat 테스트")
    void assumingThatTest() {
        String assuming = "test1";
        int a = 1;
        assumingThat(
                assuming.equals("test2")    // (1) 가정 boolean 또는 BooleanSupplier
                , () -> assertEquals(2, a));// (2) 가정을 충족할 때 실행할 코드(Executable 타입)
    }
    
    @ParameterizedTest
    @DisplayName("parameter 테스트")
    @Disabled
    @ValueSource(strings = {"a"})
    void parameterTest(String a) {
        assertEquals(a, "a");
    }
    
    @ParameterizedTest
    @DisplayName("parameters 테스트")
//    @Disabled
//    @CsvSource(value = {"a,b"})
    @CsvSource(value = {"a:b"}, delimiter = ':' )
    void parametersTest(String a, String b) {
        Assertions.assertAll(
                () -> assertEquals(a, "a")
                ,() -> assertEquals(b, "b"));
    }
}
