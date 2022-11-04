package blockchain;

import java.util.Random;

public class MagicNumberUtil {
    public static long randomNumber() {
        Random random = new Random();
        return random.longs(999999, 99999999).findFirst().getAsLong();
    }
}
