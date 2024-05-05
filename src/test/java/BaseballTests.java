import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class BaseballTests {
    @Test
    void randomNumberGenerationTest() {
        // given
        final OppoCom oppoCom = new OppoCom();

        // when
        int[] testArr1 = oppoCom.randomArr();
        int[] testArr2 = oppoCom.randomArr();

        // then
        assertThat(testArr1).isNotEqualTo(testArr2);
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void applicationTerminateTest() {
        final Application application = new Application();

    }


}
