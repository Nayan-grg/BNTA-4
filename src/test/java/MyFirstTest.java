import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {


    @Test
    void hello1(){
        //Given
        //When
        //Then

        //Given
        int numberOne= 4;
        int numberTwo=4;
        //When
        int result= numberTwo+numberOne;
        //Then
        assertThat(result).isEqualTo(8);

    }

    @Test
    void hello2(){

    }
    //Package protected and no return
}
