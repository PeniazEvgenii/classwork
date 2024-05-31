package Function;

import java.util.Comparator;

public class PrrobnyiTest {
    public static void main(String[] args) {
        String phoneNumber = "fdfsdfsdf+375 (33) 771-52-71dsfsdfsdfsdf dfsdf +375 (44) 777-52-71 \n" +
                "dfgdf +375 (25) 111-52-25 fghdfgh +375 (25) 999-99-25 dfdsf";

        String regexp = "(?:\\+375)?\\s?\\((?<code>\\d{2})\\)\\s?(\\d{3})-(\\d{2})-(\\d{2})";
    }
}
