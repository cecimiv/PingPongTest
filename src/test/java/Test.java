import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {
@Test
    void shouldConvertToOne() {
    assertEquals("I", toRoman(1));

}
    @Test
    void shouldConvertToTwo(){
    assertEquals("II", toRoman(2));

}

@Test
    void shouldConvertToThree(){
    assertEquals("III", toRoman(3));

}

@Test
    void shouldConvertToFour(){
    assertEquals("IV", toRoman(4));

}





    private String toRoman(int number) {
        String result = "";
        while(number >= 10){
            result += "X";
            number -= 10;
        }
        if(number >= 9){
            result += "IX";
            number -= 9;
        }
        if(number >= 5){
            result += "V";
            number -= 5;
        }
        if(number >= 4){
            result += "IV";
            number -= 4;
        }
        for (int i = 0; i < number; i++) {
            result += "I";
        }

        return result;
    }
}
