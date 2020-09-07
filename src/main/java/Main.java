public class Main {
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

