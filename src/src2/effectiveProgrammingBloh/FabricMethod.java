package effectiveProgrammingBloh;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class FabricMethod {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.probablePrime(128, new Random());
        System.out.println(bigInteger);

        Boolean b = Boolean.TRUE;
    }
}
