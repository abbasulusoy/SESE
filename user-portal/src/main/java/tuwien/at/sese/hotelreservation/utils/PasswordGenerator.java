package tuwien.at.sese.hotelreservation.utils;

import java.util.Random;

public class PasswordGenerator {

    public String generateRC() {
        int i = 1;
        int length = 8;
        char[] chars = "abcdefghijklmnopqrstuvwxyz2131994".toCharArray();
        StringBuilder stringbuilder = new StringBuilder();
        Random random = new Random();
        while (i <= length) {
            char c = chars[random.nextInt(chars.length)];
            stringbuilder.append(c);
            i = i + 1;
        }

        String code = stringbuilder.toString();
        System.out.println("new password: " + "'" + code + "'");
        return code;
    }

    public static void main(String[] args) {
        PasswordGenerator gen = new PasswordGenerator();
        gen.generateRC();
    }

}
