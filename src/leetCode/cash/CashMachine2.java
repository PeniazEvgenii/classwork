package leetCode.cash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CashMachine2 {
    private final String name;
    private Map<BYN, Integer> byn = new HashMap<>();
    private Map<EUR, Integer> eur = new HashMap<>();
    private Map<USD, Integer> usd = new HashMap<>();

    public CashMachine2(String name) {
        this.name = name;
    }

    public List<Integer> getByn() {
        List<Integer> collect = byn.entrySet()
                .stream()
                .filter(e -> e.getValue() > 0)
                .map(Map.Entry::getKey)
                .map(BYN::getValueNumber)
                .sorted()
                .collect(Collectors.toList());

        return collect;
    }

    public List<Integer> getEur() {
        List<Integer> collect = eur.entrySet()
                .stream()
                .filter(e -> e.getValue() > 0)
                .map(Map.Entry::getKey)
                .map(EUR::getValueNumber)
                .sorted()
                .collect(Collectors.toList());

        return collect;
    }

    public void addByn(BYN BYN, int count) {
        byn.put(BYN,count);
    }

    public void addEur(EUR EUR, int count) {
        eur.put(EUR,count);
    }



}
