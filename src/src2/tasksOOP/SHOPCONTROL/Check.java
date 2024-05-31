package tasksOOP.SHOPCONTROL;

import java.util.ArrayList;
import java.util.List;

public class Check {
    List<String> list = new ArrayList<>();
    private double sum = 0;

    public void add (ProductInBasket product){
        double cost = product.getCount() * product.getProduct().getCost().doubleValue();
         sum += cost;
        list.add(product.getProduct().toString() + ", Количество " + product.getCount() + ", Стоимость " + cost);

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : list) {
            stringBuilder.append(s).append("\n");
        }

        stringBuilder.append(sum);
        return stringBuilder.toString();
    }
}
