package K_IO_Stream.ByteStream.ObjectInput_OutputSteam.Externalizable;
import java.io.*;

class Person implements Externalizable {
    private String name;
    private int age;

    public Person() {
        // Required for Externalizable
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ExternalizableExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Alice", 30);

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            oos.writeObject(person);
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person restoredPerson = (Person) ois.readObject();
            System.out.println("Restored Person: " + restoredPerson);
        }
    }
}
/*
 In Java, the Externalizable interface is an alternative to the Serializable interface that allows you to have more control over the serialization and deserialization process of objects. While the Serializable interface provides automatic serialization and deserialization, the Externalizable interface requires you to explicitly implement methods for customizing these processes.

The Externalizable interface is defined in the java.io package and contains two methods that need to be implemented:

void writeExternal(ObjectOutput out): This method is called during serialization to write the state of the object to the ObjectOutput stream. You have to manually specify what data should be written and in what format.

void readExternal(ObjectInput in): This method is called during deserialization to read the state of the object from the ObjectInput stream. You need to manually read and reconstruct the object's state based on the data in the stream.
 */