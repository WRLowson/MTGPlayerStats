package utils;

import java.util.Random;

public class IDUtils {
    private static final Random random = new Random();


    public static String generateHexPlayerID(){
        int length = 8;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++){
            int hexDigit = random.nextInt(16);
            sb.append(Integer.toHexString(hexDigit).toUpperCase());
        }
        return sb.toString();
    }
}
