package leetCode.cash;

import java.util.Scanner;

public class CashRunner2 {
   public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CashMachine2 cashMachine2 = new CashMachine2("Банкомат №24");
        cashMachine2.addByn(BYN.TWENTY, 50);
        cashMachine2.addByn(BYN.FIFTY, 50);
        cashMachine2.addByn(BYN.HUNDRED, 50);
        cashMachine2.addByn(BYN.TWO_HUNDRED, 50);
        cashMachine2.addByn(BYN.FIVE_HUNDRED, 50);

        cashMachine2.addEur(EUR.TWENTY, 50);
        cashMachine2.addEur(EUR.FIFTY, 50);
        cashMachine2.addEur(EUR.HUNDRED, 50);

        System.out.println(cashMachine2.getByn());
        System.out.println(cashMachine2.getEur());

        int currency = changeCurrency();
        System.out.println("Доступный номинал");
        if(currency == 2) {
            System.out.println(cashMachine2.getEur());
        }
        if (currency == 3) {
            System.out.println(cashMachine2.getByn());
        }
    }

    private static int changeCurrency() {
        int result;
        boolean isCheck;
        do {
            System.out.println("выберите валюту для снятия: \n 1 - USD \n 2 - EUR \n 3 - BYN");
            result = scanner.nextInt();
            isCheck = result > 3 || result < 1;
            if(isCheck) {
                System.out.println("Вы выбрали неверную валюту");
            }
        } while(isCheck);
        return result;
    }
}
