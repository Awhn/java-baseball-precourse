import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class BaseballTests {
    @Test
    @DisplayName("1에서 9까지의 서로 다른 임의의 수 3개를 선택함")
    void randomNumberGenerationTest() {
        // given
        final OppoCom oppoCom = new OppoCom();

        // when
        int[] testArr1 = oppoCom.randomArr();
        int[] testArr2 = oppoCom.randomArr();

        // then
        assertThat(testArr1).isNotEqualTo(testArr2);
    }

    @Test
    @DisplayName("같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱을 출력함")
    void checkStatTest() {
        // given
        final OppoCom oppoCom = new OppoCom();

        // when
        int[] test = {1,2,3};
        oppoCom.setAnsArr(test);

        //then
        assertThat(oppoCom.checkNum(123)[0]).isEqualTo(3);
    }

    @Test
    @DisplayName("잘못된 값 입력 시 IllegalArgumentException 발생")
    void inputErrorTest() {
        // given
        final Application application = new Application();

        // when
        String input = "10000";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            application.getInput(0, 999);
        });

        // 입력 스트림 초기화
        System.setIn(System.in);
    }
}

