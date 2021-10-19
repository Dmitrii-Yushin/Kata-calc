public class Convert {

    public static int romToArab(String number) {
        int num = 0;
        String[] rom = new String[] {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        for (int i = 0; i < rom.length; i++) {
            if (rom[i].equals(number)) {
                num = i + 1;
                break;
            }
        }
        return num;
    }

    public static String arabToRom(int number) {

        if (number < 1) throw new RomanNumberException(String.valueOf(number));
        StringBuilder num = new StringBuilder();
        int dec = number / 10;
        int ed = number % 10;
        if (dec < 4) {
            num.append("X".repeat(dec));
        } else if (dec == 4) {
            num.append("XL");
        } else if (dec == 9) {
            num.append("XC");
        } else if (dec == 10) {
            num.append("C");
        } else {
            num.append("L");
            num.append("X".repeat(dec - 5));
        }
        if (ed < 4) {
            num.append("I".repeat(ed));
        } else if (ed == 4) {
            num.append("IV");
        } else if (ed == 9) {
            num.append("IX");
        } else {
            num.append("V");
            num.append("I".repeat(ed - 5));
        }
        return num.toString();
    }
}