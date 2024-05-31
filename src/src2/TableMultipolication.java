public class TableMultipolication {
    public static void main(String[] args) {

        printTable(1, 2);
        String s = "sdsdsd";
        String s2 = s.substring(0 );


        int start = 5;
        int columnInRow = 4;
        int kolRow = 2;

        for (int i = 0; i < kolRow; i++) {
            printTable(start + columnInRow * i, start + columnInRow + columnInRow * i);
        }
    }


    public static void printTable(int from, int to){
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j < to; j++) {
                System.out.print(i + " x " + j + " = " + i*j + "\t\t");
            }
            System.out.println();
        }
    }

}
