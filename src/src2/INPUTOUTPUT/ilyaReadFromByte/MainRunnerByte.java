package INPUTOUTPUT.ilyaReadFromByte;

import java.io.*;
import java.nio.file.Path;

public class MainRunnerByte {
    public static void main(String[] args) {
        File file  = new File("classwork/src/INPUTOUTPUT/ilyaReadFromByte/TestStartEng");

        try {
            InputStream input = new FileInputStream("classwork/src/INPUTOUTPUT/ilyaReadFromByte/TestStart.txt");

            byte[] bytes = new byte[input.available()];


            int read;
            int count = 0;
            while ((read = input.read()) != -1) {
                int countByte = getOctetCount(read);
                StringBuilder stringBuilder = new StringBuilder();
                if(countByte >= 0) {
                    stringBuilder.append(Integer.toBinaryString(read).substring(countByte + 1));
                }

                for (int i = 1; i < countByte; i++) {
                    int nextByte = input.read();
                    String byteStr = Integer.toBinaryString(nextByte);
                    if(byteStr.startsWith("10")){
                        stringBuilder.append(byteStr.substring(2));
                    }
                }
                String result = stringBuilder.toString();
                System.out.println("из билдера " + result);
                System.out.println((char)Integer.parseInt(result, 2));
                System.out.println(Integer.toBinaryString(read) + " : " + (char)read);
               // bytes[count ++] = (char)read;

            }
            String s = new String(bytes);
            System.out.println(s);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getOctetCount(int readByte) {
        String str = Integer.toBinaryString(readByte);
       str = String.format("%8S", str);
       str = str.replace(" ", "0");
        int result;
        if(str.charAt(0) == '0') {
            result = 1;
       // } else if(str.charAt(0) == '1' && str.charAt(1) == '0') {
       //     return 5;
       //
        } else if (str.charAt(1) == '1' && str.charAt(2) == '0') {
            result = 2;
        } else if(str.charAt(3) == '0') {
            result = 3;
        } else {
            result = 4;
        }

        return result;
    }

    public static int getOctetCount2(int readByte) {
        String str = Integer.toBinaryString(readByte);
        str = String.format("%8S", str);
        str = str.replace(" ", "0");
        System.out.println(" fdf " + str + " dffdf");
        int result;
        if (str.startsWith(Octet.FOUR.getStartWith())) {
            return 4;
        } else if (str.startsWith("1110")) {
            return 3;
        } else if (str.startsWith("110")) {
            return 2;
        } else if (str.startsWith("10")) {
            return 5;
        } else {
            return 1;
        }
    }

    public enum Octet {
        ONE ("0",1),
        TWO ("110",2),
        THREE ("1110",3),
        FOUR ("11110",4);

        private final String startWith;
        private final int count;

        Octet(String startWith, int count) {
            this.startWith = startWith;
            this.count = count;
        }

        public String getStartWith() {
            return startWith;
        }
    }


//
//    public  int getCount() {
//        return this.count;
//    }
}
