package serelizacia;

import java.io.*;
import java.nio.file.Path;

public class SerializationDemo {
    public static void main(String[] args) {
        Path path = Path.of("classwork/src/serelizacia/resourses/student.out");

      //  writeObject(path);
       try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
           Object object = objectInputStream.readObject();
           System.out.println(object);

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           System.out.println("dfsdgfjkl;fd");;
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }

    }

    private static void writeObject(Path path) {
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            PersonSereliz vasilii = new PersonSereliz(18, "Vasilii");
            objectOutputStream.writeObject(vasilii);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
