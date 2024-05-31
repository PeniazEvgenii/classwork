package serelizacia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RunnerPersonSer {
    public static void main(String[] args) {
        List<PersonTestForSereliz> list = new ArrayList<>();
        createList(list);

        File file = new File("classwork/src/serelizacia/resourses/person.txt");

        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream((file), false))) {

            for (PersonTestForSereliz personTest: list) {
                stream.writeObject(personTest);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream((file)))) {
           while(true) {
               Object o = stream.readObject();
           System.out.println(o);
           }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println(" ошибка ");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    private static void createList(List<PersonTestForSereliz> list) {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < 1000 ; i++) {
            list.add(new PersonTestForSereliz(
                    "Vasia",
                    random.nextInt(18, 65),
                    "Developer")
            );
        }
    }

}
