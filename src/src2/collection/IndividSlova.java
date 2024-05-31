package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class IndividSlova {

   // private static final String EMPTY = "";
   // private static final String SPACE = " ";
//
   // private IndividSlova() {};
//
   // public static Map<String, Integer> calcWordFrequency(String text) {
   //     Map<String, Integer> resultMap = new HashMap<>();
   //     String[] words = text
   //             .replace(".", EMPTY)
   //             .replace(",", EMPTY)
   //             .replace("!", EMPTY)
   //             .split(SPACE);
   //     for (String word : words) {
   //         Integer oldCount = resultMap.get(word);
   //         Integer newCount = oldCount == null ? 1 : oldCount + 1;
   //         resultMap.put(word,newCount);
   //     }
   //     return resultMap;
   // }

     public static Map<String, Integer> calcWordFrequency(String text) {
         Map<String, Integer> resultMap = new HashMap<>();
         Pattern pattern = Pattern.compile("[A-Za-z]");
         Matcher matcher = pattern.matcher(text);
         while (matcher.find()) {
             System.out.println(matcher.group());
             Integer valueCurrent = resultMap.get(matcher.group());
             Integer valueNew = (valueCurrent == null ? 1 : valueCurrent + 1);
             resultMap.put(matcher.group(), valueNew);
         }
         return resultMap;
     }

}

class WordDemo {
    public static void main(String[] args) {
        String text = "Fruit and vegetables contain the vitamins and minerals " +
                "we need to stay healthy. But five is actually a fictional number " +
                "thought up by an American nutritionist. She looked at what the average " +
                "person ate and doubled it. According to more recent research, the right " +
                "number is actually eight. The research shows that people who have eight " +
                "pieces of fruit and vegetables a day are much less likely to suffer " +
                "from heart disease than those who eat three.";
        System.out.println(IndividSlova.calcWordFrequency(text));
    }
}
