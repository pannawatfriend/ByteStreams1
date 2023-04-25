package bytestream1;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Student implements Serializable{
    String id;
    String name;

    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }
}
