package comparingstudents;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Lukas Fisar
 */
public class Datasource {
    private static Student[] data = {
        new Student("Alice", "Mala", 345),
        new Student("Bob", "Velky", 123),
        new Student("Cyril", "Stredni", 567)
    };
    
    public static Student[] loadDataAsArray() {
        return Arrays.copyOf(data, data.length);
    }
    
    public static List <Student> loadDataAsList() {
        return Arrays.asList(data);
        //ArrayList<Student> students = new ArrayList<>();
        //students.addAll(Arrays.asList(data));
    }
}
